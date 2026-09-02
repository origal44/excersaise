package org.example;

// מחזיק מצב ריצה משותף. הפתרון ל-Exit: במקום לעצור את התוכנית "ביד",
// ExitCommand מסמן כאן שהלולאה צריכה להפסיק, והלולאה הראשית בודקת זאת.
// ככה היציאה נשארת פקודה מן המניין (כמו שהמסמך ביקש).
public class GameState {
    private boolean running = true;

    public boolean isRunning() {
        return running;
    }

    public void stop() {
        running = false;
    }
}
