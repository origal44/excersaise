    package org.example;

    public class HelpCommand implements Command {
        private Display display;

        public HelpCommand(Display display)
        {
            this.display = display;
        }




        @Override
        public void execute(){display.showInstructions();}

    }

