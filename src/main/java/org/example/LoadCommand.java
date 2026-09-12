package org.example;


public class LoadCommand implements Command {
    private Loader loader;
    private Board board;      // ← שדה חדש
    private String fileName;

    public LoadCommand(Loader loader, Board board, String fileName) {
        this.loader = loader;
        this.board = board;   // ← שמירה
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        loader.load(board, fileName);
    }
}