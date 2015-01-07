package pac2;

public class Game {
	private static Game instance = null;
	private int idGame, errors;
	private static int lastGame;
	private boolean finished, won;
	private String word;

	private Cell[] celdas;
	private Player player;
	Puntuacio puntuacio;

	private Game(int idGame, String word, Player player2) {
		int numCeldas = word.length();
		celdas = new Cell[numCeldas];
		this.word = word;
		this.idGame = idGame;
		int p = 0;
		for (Cell c : celdas) {
			c = new Cell(p);
			char a = word.charAt(p);
			c.setLetter(a);
			celdas[p] = c;
			p++;
		}
		setPlayer(player2);
		if (player.getPartidesGuanyades() > 1) {
			puntuacio = new Puntuacio(2);
		} else {
			puntuacio = new Puntuacio(1);
		}
	}

	public static Game getGameInstance(int idGame, String word, Player player) {
		if (instance == null || idGame != lastGame) {
			instance = new Game(idGame, word, player);
			lastGame = idGame;
		}
		return instance;

	}

	public static Game getGameById(int idGame) {
		return instance;
	}

	public Player getPlayer() {
		return player;
	}

	private void setPlayer(Player player) {
		this.player = player;
	}

	public int getErrors() {
		return errors;
	}

	public boolean isFinished() {
		return finished;
	}

	public boolean isWon() {
		return won;
	}

	public String getWord() {
		return word;
	}

	public Cell[] getCeldas() {
		return celdas;
	}

	public void tryPlay(Letters a, int position) {
		puntuacio.puntuar(a, celdas[position]);
		System.out.println("Lletra:" + a.name() + " Punts:" + puntuacio.getPuntuacio());
		boolean totesOK = true;
		for (Cell c : celdas) {
			if (!c.isRightGuess()) {
				totesOK = false;
			}
		}
		if (totesOK) {
			won = true;
			System.out.println("HAS GUANYAT: Paraula amagada era:" + word + " Puntuació Final:"
					+ puntuacio.getPuntuacio());
			player.setPartidesGuanyades(player.getPartidesGuanyades() + 1);
		}
	}

}
