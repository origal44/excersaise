package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// טוען עבור קבצי txt.
public class TextLoader implements Loader {
    @Override
    public void load(Board board, String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load level: " + fileName, e);
        }

        int height = lines.size();
        int width = 0;
        for (String l : lines) {
            width = Math.max(width, l.length());
        }
        board.initGrid(width, height);

        for (int y = 0; y < height; y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++) {
                char c = line.charAt(x);
                Position pos = new Position(x, y);
                switch (c) {
                    case '#' -> board.placeWall(pos);
                    case ' ' -> { }                            //ברירת מחדל
                    case '.' -> board.placeTarget(pos);
                    case '@' -> board.setPlayer(pos);
                    case '+' -> { board.setPlayer(pos); board.placeTarget(pos); }
                    case '$' -> board.placeBox(pos);
                    case '*' -> { board.placeBox(pos); board.placeTarget(pos); }
                    default -> throw new IllegalArgumentException("Invalid char '" + c + "', please check file");
                }
            }
        }
    }
}