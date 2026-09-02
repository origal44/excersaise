package org.example;

// פקודת יציאה. receiver = GameState.
// היא לא עוצרת את התוכנית ישירות - היא מסמנת ל-GameState לעצור,
// והלולאה הראשית מגיבה. ככה היציאה היא פקודה מן המניין ואחידה עם השאר.
public class ExitCommand implements Command {
    private GameState gameState;

    public ExitCommand(GameState gameState) {
        this.gameState = gameState;
    }

    @Override
    public void execute() {
        gameState.stop();
    }
}
