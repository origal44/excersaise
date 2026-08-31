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

    // מקבל שורת קלט מלאה (למשל "Move up" או "Load sokoban.txt"),
    // ומחזיר את אובייקט הפקודה המתאים.
    public Command create(String input) {
        // TODO:
        //  1. לפצל את input לטוקנים (למשל input.trim().split("\\s+"))
        //  2. הטוקן הראשון = שם הפקודה ; שאר הטוקנים = פרמטרים
        //  3. לפי שם הפקודה - ליצור ולהחזיר את ה-Command הנכון:
        //       "Load"    -> new LoadCommand(loader, fileName)
        //       "Save"    -> new SaveCommand(save, fileName, board)
        //       "Move"    -> new MoveCommand(board, direction)
        //       "Display" -> new DisplayCommand(display, board)
        //       "Exit"    -> new ExitCommand(gameState)
        //  4. אם לא זוהתה פקודה - להחזיר null או לזרוק חריגה מתאימה
        return null;
    }
}
