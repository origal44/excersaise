package org.example;


public class DisplayCommand implements Command {
    private Display display;
    private Board board;

    public DisplayCommand(Display display, Board board) {
        this.display = display;
        this.board = board;
    }




    @Override
    public void execute() {
        display.show(board);
    }
}
