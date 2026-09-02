package org.example;

// ה-Invoker / "מפרסר הפקודות".
// אחראי: לקבל שורת קלט מהמשתמש -> לזהות איזו פקודה זו -> ליצור את
// אובייקט הפקודה המתאים עם ה-receiver והפרמטרים הנכונים.
//
// שים לב: אפשר להשתמש כאן ב-HashMap (מפתח = שם הפקודה) כדי להימנע
// מ-if/else ענק. האתגר: לכל פקודה פרמטרים שונים ויש ליצור אובייקט חדש
// בכל פעם. שתי גישות אפשריות:
//  - switch על שם הפקודה שמחזיר Command חדש (פשוט, מספיק לתרגיל)
//  - map של "יצרני פקודות" (factories) - אלגנטי ומרחיב יותר (מתקדם)
public class CommandFactory {

    // כל ה-receivers שהפקודות עשויות לצרוך. מוזרקים מבחוץ (DI).
    private Board board;
    private Loader loader;
    private Save save;
    private Display display;
    private GameState gameState;

    public CommandFactory(Board board, Loader loader, Save save,
                          Display display, GameState gameState) {
        this.board = board;
        this.loader = loader;
        this.save = save;
        this.display = display;
        this.gameState = gameState;
    }


    public Command create(String input) {
        String[] tokens = input.trim().split("\\s+");
        String name = tokens[0];

        switch (name) {
            case "Load" -> {
                String fileName = tokens[1];
                return new LoadCommand(loader, board, fileName);
            }
            case "Save" -> {
                String fileName = tokens[1];
                return new SaveCommand(save,fileName,board);

            }
            case "Move" -> {
                Direction direction = Direction.valueOf(tokens[1].toUpperCase());
                return new MoveCommand(board, direction);

            }
            case "Exit" -> {
                return new ExitCommand(gameState);

            }
            case "Display" -> {
                return new DisplayCommand(display,board);
            }
            // TODO: "Save", "Move", "Display", "Exit" — אותה תבנית
            default -> throw new IllegalArgumentException("Unknown command: " + name);
        }
    }
}
