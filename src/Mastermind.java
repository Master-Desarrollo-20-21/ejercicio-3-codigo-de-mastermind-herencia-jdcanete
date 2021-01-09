class Mastermind {

    private static final String TITLE = "                  _                      _           _\n"
        + "  /\\/\\   __ _ ___| |_ ___ _ __ _ __ ___ (_)_ __   __| |\n" 
        + " /    \\ / _` / __| __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` |\n" 
        + "/ /\\/\\ \\ (_| \\__ \\ ||  __/ |  | | | | | | | | | | (_| |\n" 
        + "\\/    \\/\\__,_|___/\\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|\n\n";

    public void play() {                                                 
        Console console = new Console();
        console.write(TITLE);
        do {
            new Game().play();
        } while (this.resume());
        console.write("Bye.\n");
    }

    private boolean resume() {
        Console console = new Console();
        String ans = null;
        do {
            ans = console.read("RESUME? (y/n): ");
        } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
        return ans.equalsIgnoreCase("y");
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}