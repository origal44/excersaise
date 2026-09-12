package org.example;


public class CommandFactory {


    private Board board;
    private Save save;
    private Display display;
    private GameState gameState;
    private LoaderRegistry loaderRegistry;

    public CommandFactory(Board board, LoaderRegistry loaderRegistry, Save save, Display display, GameState gameState) {
        this.board = board;
        this.loaderRegistry = loaderRegistry;
        this.save = save;
        this.display = display;
        this.gameState = gameState;
    }


    public Command create(String input) {
        String[] tokens = input.trim().split("\\s+");
        String name = tokens[0];

        switch (name) {
            case "Load" -> {
                String fileName = tokens[1];
                Loader loader = loaderRegistry.getLoaderFor(fileName);
                return new LoadCommand(loader, board, fileName);
            }
            case "Save" -> {
                String fileName = tokens[1];
                return new SaveCommand(save,fileName,board);

            }
            case "Move" -> {
                Direction direction = Direction.valueOf(tokens[1].toUpperCase());
                return new MoveCommand(board, direction);

            }
            case "Exit" -> {
                return new ExitCommand(gameState);

            }
            case "Display" -> {
                return new DisplayCommand(display,board);
            }
            case "Help" -> {
                return new HelpCommand(display);
            }


            default -> throw new IllegalArgumentException("Unknown command: " + name);
        }
    }
}
