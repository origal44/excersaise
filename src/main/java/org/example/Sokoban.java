package org.example;

import java.util.Scanner;

// נקודת הכניסה ולולאת המשחק הראשית.
// כאן מחברים את כל החלקים: יוצרים את ה-receivers, את ה-CommandFactory,
// וקוראים קלט בלולאה עד שהמשתמש מבצע Exit.
public class Sokoban {
    public static void main(String[] args) {

        // --- הרכבת המערכת (wiring) ---
        // כאן יוצרים את כל האובייקטים ומחברים ביניהם.
        GameState gameState = new GameState();
        Display display = new Display();
        Save save = new TextSave();          // בהמשך אולי לפי פורמט

        // ה-Loader: כאן כדאי להשתמש ב-LoaderRegistry שבנינו,
        // כדי לבחור טוען לפי סיומת הקובץ.
        // Loader loader = ... ;   // TODO: לחבר את LoaderRegistry

        // ה-Board נטען מקובץ בפקודת Load, אז בהתחלה הוא עשוי להיות null
        // עד שהמשתמש טוען שלב. חשוב איך תטפל במצב הזה.
        Board board = null;       // TODO: להחליט על מצב התחלתי

        // CommandFactory factory =
        //     new CommandFactory(board, loader, save, display, gameState);

        // --- הלולאה הראשית (CLI) ---
        Scanner scanner = new Scanner(System.in);
        while (gameState.isRunning()) {
            System.out.print("> ");
            String input = scanner.nextLine();

            // TODO:
            //  1. Command cmd = factory.create(input);
            //  2. אם cmd != null -> cmd.execute();
            //  3. אחרת -> להדפיס הודעת שגיאה על פקודה לא מוכרת
        }

        scanner.close();
        System.out.println("Bye!");
    }
}
