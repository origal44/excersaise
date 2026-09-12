package org.example;

import java.util.Set;


public class Display {

    private static final String INSTRUCTIONS = """
        === Sokoban — Commands ===
        Load <file>   - load a level
        Move <up|down|left|right> - move the player
        Display       - show the board
        Save <file>   - save the game
        Help          - show this help
        Exit          - quit the game
        """;

    public void showInstructions() {
        System.out.println(INSTRUCTIONS);
    }


    public void show(Board board) {
        TileType[][] grid = board.getGrid();
        Set<Position> boxes = board.getBoxes();
        Set<Position> targets = board.getTargets();
        Position playerPos = board.getPlayer().getPosition();

        for (int y = 0; y < grid.length; y++) {
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

                System.out.print(symbol);
            }
            System.out.println();
        }
    }

}
