package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sokoban {
    public  void instructions()
    {
        System.out.println();
    }
    public static void main(String[] args) {

        GameState gameState = new GameState();
        Display display = new Display();
        Save save = new TextSave();
        LoaderRegistry loaderRegistry = new LoaderRegistry();

        Policy policy = new StandardPolicy();
        Player player = new Player(new Position(0, 0));
        Set<Position> boxes = new HashSet<>();
        Set<Position> targets = new HashSet<>();
        Board board = new Board(null, player, boxes, targets, policy);

        CommandFactory factory =
                new CommandFactory(board, loaderRegistry, save, display, gameState);

        Scanner scanner = new Scanner(System.in);
        while (gameState.isRunning()) {
            System.out.print("> ");
            System.out.println("Please Type Help for instructions");

            String input = scanner.nextLine();
            try {
                Command cmd = factory.create(input);
                cmd.execute();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
        System.out.println("Bye!");
    }
}