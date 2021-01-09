class Attemp {

    private static final int MAX_BLACKS = 4;

    private final ProposedCombination proposedCombination;

    private final SecretCombination secretCombination;

    private final int countBlacks;

    private final int countWhites;

	public Attemp(SecretCombination secretCombination) {
        this.secretCombination = secretCombination;
        this.proposedCombination = new ProposedCombination();
        this.countWhites = this.secretCombination.colorMatch(proposedCombination);
        this.countBlacks = this.secretCombination.colorAndPositionMatch(proposedCombination);
    }

	public boolean isGuessed() {
        return this.countBlacks == MAX_BLACKS;
    }
    
    public void show() {
        Console console = new Console();
        proposedCombination.show();
        console.write(" --> " + countBlacks + " blacks and " + countWhites + " whites\n");
    }

}
