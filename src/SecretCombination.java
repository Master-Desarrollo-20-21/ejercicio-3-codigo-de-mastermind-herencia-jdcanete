class SecretCombination extends Combination {

    public SecretCombination() {
        char[] colors = new char[SIZE];
        int countColor = 0;
        do {
            char color = VALID_COLORS[(int)(Math.random() * (VALID_COLORS.length))];
            boolean found = false;
            for (int i = 0; i < countColor; i++) {
                if (color == colors[i]) {
                    found = true;
                }
            }
            if (!found) {
                colors[countColor] = color;
                countColor++;
            }
        } while (countColor < 4);
        this.colors = colors;
    }

	public int colorMatch(ProposedCombination proposedCombination) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE; j++) {
                if (proposedCombination.colors[i] == this.colors[j]) {
                    count++;
                }
            }
        }
        return count;
	}

	public int colorAndPositionMatch(ProposedCombination proposedCombination) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (proposedCombination.colors[i] == this.colors[i]) {
                count++;
            }
        }
		return count;
	}

	public void show() {
        Console console = new Console();
        console.write("xxxx\n");
	}
}
