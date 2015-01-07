package pac2;

public class Player {

	private String name;
	private int partidesGuanyades;

	public Player(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getPartidesGuanyades() {
		return partidesGuanyades;
	}

	public void setPartidesGuanyades(int partidesGuanyades) {
		this.partidesGuanyades = partidesGuanyades;
	}
}
