package org.example;

// פקודת טעינה. receiver = Loader, parameter = fileName.
// כל המידע מוזרק דרך ה-constructor ברגע היצירה,
// כדי שברגע הביצוע (execute) יהיה לפקודה כל מה שהיא צריכה.
public class LoadCommand implements Command {
    private Loader loader;      // ה-receiver
    private String fileName;    // הפרמטר

    public LoadCommand(Loader loader, String fileName) {
        this.loader = loader;
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        loader.load(fileName);   // ה-receiver עושה את העבודה האמיתית
    }
}
