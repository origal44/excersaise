package org.example;

// פקודת טעינה. receiver = Loader, parameter = fileName.
// כל המידע מוזרק דרך ה-constructor ברגע היצירה,
// כדי שברגע הביצוע (execute) יהיה לפקודה כל מה שהיא צריכה.
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