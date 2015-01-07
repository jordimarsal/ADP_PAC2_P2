package pac2;

public class Cell {

	private int position;
	private Letters correctLetter;
	private Letters[] errorLetters;
	private boolean rightGuess;
	private int positionError;

	public Cell(int position) {
		this.position = position;
		// errorLetters = new String[27];
		errorLetters = new Letters[27];
		positionError = 0;
	}

	public Letters getCorrectLetter() {
		return correctLetter;
	}

	private void setCorrectLetter(Letters correctLetter) {
		this.correctLetter = correctLetter;
	}

	public int getPosition() {
		return position;
	}

	public Letters[] getErrorLetters() {
		return errorLetters;
	}

	public boolean isRightGuess() {
		return rightGuess;
	}

	public void setRightGuess(boolean rightGuess) {
		this.rightGuess = rightGuess;
	}

	public void setLetter(char charAt) {
		for (Letters l : Letters.values()) {
			String ch = "" + charAt;
			if (ch.equals(l.name())) {
				setCorrectLetter(l);
			}
		}

	}

	public void addErrorLetter(Letters a) {
		errorLetters[positionError] = a;
		positionError++;
	}
}
