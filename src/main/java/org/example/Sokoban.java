package org.example;

import java.util.HashSet;
import java.util.Set;

public class Sokoban {
    public static void main(String[] args) {

        // ====== בדיקה זמנית: בונים Board קטן ביד כדי לבדוק את Display ======
        // הלוח שנבנה:
        //   ###
        //   #@*      (שחקן באמצע, קופסה-על-מטרה מימינו)
        //   ###

        // grid: רק קיר/רצפה. זכור [y][x] = [שורה][עמודה]
        TileType[][] grid = {
                { TileType.WALL, TileType.WALL,  TileType.WALL  },
                { TileType.WALL, TileType.FLOOR, TileType.FLOOR },
                { TileType.WALL, TileType.WALL,  TileType.WALL  }
        };

        // שחקן במרכז: עמודה 1, שורה 1
        Player player = new Player(new Position(1, 1));

        // קופסה ומטרה - שתיהן ב-(2,1), אמור להציג '*'
        Set<Position> boxes = new HashSet<>();
        boxes.add(new Position(2, 1));

        Set<Position> targets = new HashSet<>();
        targets.add(new Position(2, 1));

        Policy policy = new StandardPolicy();
        Board board = new Board(grid, player, boxes, targets, policy);

        Display display = new Display();
        display.show(board);
        // ====== סוף הבדיקה הזמנית ======


        // ====== הקוד האמיתי של המשחק (מושבת בינתיים בזמן הבדיקה) ======
        /*
        GameState gameState = new GameState();
        Display display = new Display();
        Save save = new TextSave();

        // Loader loader = ... ;   // TODO: לחבר את LoaderRegistry
        Board board = null;        // TODO: מצב התחלתי

        // CommandFactory factory =
        //     new CommandFactory(board, loader, save, display, gameState);

        Scanner scanner = new Scanner(System.in);
        while (gameState.isRunning()) {
            System.out.print("> ");
            String input = scanner.nextLine();
            // Command cmd = factory.create(input);
            // if (cmd != null) cmd.execute();
            // else System.out.println("Unknown command");
        }
        scanner.close();
        System.out.println("Bye!");
        */
    }
}