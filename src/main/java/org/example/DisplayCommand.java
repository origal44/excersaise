package org.example;


public class DisplayCommand implements Command {
    private Display display;   // ה-receiver
    private Board board;       // מה מציגים

    public DisplayCommand(Display display, Board board) {
        this.display = display;
        this.board = board;
    }

    @Override
    public void execute() {
        display.show(board);
    }
}
