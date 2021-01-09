class Game {

	private static final int MAX_ATTEMPS = 10;

	private Attemp[] attemps;

	private SecretCombination secretCombination;

	private int countAttemp;

	public Game() {
		this.attemps = new Attemp[Game.MAX_ATTEMPS];
		this.secretCombination = new SecretCombination();
	}

	public void play() {
		Console console = new Console();
		do {
			console.write("\n" + countAttemp + " attemp(s):\n");
			secretCombination.show();
			for (int i = 0; i < countAttemp; i++) {
				attemps[i].show();
			}
			countAttemp++;
			attemps[countAttemp - 1] = new Attemp(secretCombination);
		} while (countAttemp < MAX_ATTEMPS && !attemps[countAttemp - 1].isGuessed());
		if (attemps[countAttemp - 1].isGuessed()) {
			console.write("You've won!!! ;-)\n");
		} else {
			console.write("You've lost!!! :-(\n");
		}
	}
	
}
