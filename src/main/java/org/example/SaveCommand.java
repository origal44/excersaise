package org.example;

// פקודת שמירה - התאום של LoadCommand.
// receiver = Save, פרמטרים = fileName + ה-Board שרוצים לשמור.
public class SaveCommand implements Command {
    private Save save;          // ה-receiver
    private String fileName;    // הפרמטר
    private Board board;        // מה שומרים

    public SaveCommand(Save save, String fileName, Board board) {
        this.save = save;
        this.fileName = fileName;
        this.board = board;
    }

    @Override
    public void execute() {
        save.save(fileName, board);
    }
}
