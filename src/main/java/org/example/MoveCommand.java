package org.example;

// פקודת תנועה. receiver = Board, parameter = direction ("up"/"down"/...).
public class MoveCommand implements Command {
    private Board board;        // ה-receiver
    private String direction;   // הפרמטר

    public MoveCommand(Board board, String direction) {
        this.board = board;
        this.direction = direction;
    }

    @Override
    public void execute() {
        board.move(direction);
    }
}
