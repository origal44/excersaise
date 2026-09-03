package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class TextSave implements Save {
    @Override
    public void save(String fileName, Board board) {
        TileType[][] grid = board.getGrid();
        Set<Position> boxes = board.getBoxes();
        Set<Position> targets = board.getTargets();
        Position playerPos = board.getPlayer().getPosition();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int y = 0; y < grid.length; y++) {
                StringBuilder line = new StringBuilder();
                for (int x = 0; x < grid[y].length; x++) {
                    Position current = new Position(x, y);
                    char symbol;
                    boolean onTarget = targets.contains(current);
                    boolean hasBox = boxes.contains(current);
                    boolean isPlayer = current.equals(playerPos);
                    if (grid[y][x] == TileType.WALL)      symbol = '#';
                    else if (isPlayer && onTarget)         symbol = '+';
                    else if (isPlayer)                     symbol = '@';
                    else if (hasBox && onTarget)           symbol = '*';
                    else if (hasBox)                       symbol = '$';
                    else if (onTarget)                     symbol = '.';
                    else                                   symbol = ' ';

                    line.append(symbol);
                }
                writer.write(line.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to save: " + fileName, e);
        }

    }
}
