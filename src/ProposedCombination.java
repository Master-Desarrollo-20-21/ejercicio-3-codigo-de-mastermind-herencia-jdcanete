class ProposedCombination extends Combination {

    public ProposedCombination() {
        Console console = new Console();
        char[] colors = null;
        boolean error = false;
        do {
            colors = console.read("Propose a combination: ").toUpperCase().toCharArray();
            error = !this.isValidLength(colors) || !this.isValidColors(colors) || this.isRepeated(colors);
        } while (error);
        this.colors = colors;
    }

    private boolean isValidLength(char[] colors) {
        Console console = new Console();
        if (colors.length != SIZE) {
            console.write("Wrong proposed combination length\n");
            return false;
        }
        return true;
    }

    private boolean isValidColors(char[] colors) {
        Console console = new Console();
        for (int i = 0; i < colors.length; i++) {
            int j = 0;
            while (j < VALID_COLORS.length && colors[i] != VALID_COLORS[j]) {
                j++;
            }
            if (j == VALID_COLORS.length) {
                console.write("Wrong colors, they must be: rbygop\n");
                return false;
            }
        }
        return true;
    }

	private boolean isRepeated(char[] colors) {
        Console console = new Console();
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] == colors[j]) {
                    console.write("Wrong colors, contains repeated\n");
                    return true;
                }
            }
        }
        return false;
    }

    public void show() {
        Console console = new Console();
        console.write(new String(this.colors));
    }
    
    public char[] getColors() {
        return this.colors;
    }

}
