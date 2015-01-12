package pac2;

public class PAC2Main {

	public static void main(String[] args) {

		Player p1 = new Player("Joselito");
		p1.setPartidesGuanyades(1);

		System.out.println("Partides jugador guanyades:" + p1.getPartidesGuanyades());

		Game game = Game.getGameInstance(1, "UNO", p1);
		game.tryPlay(Letters.A, 0);
		game.tryPlay(Letters.U, 0);
		game.tryPlay(Letters.B, 1);
		game.tryPlay(Letters.N, 1);
		game.tryPlay(Letters.O, 2);

		System.out.println("Partides jugador guanyades:" + p1.getPartidesGuanyades());

		Game game2 = Game.getGameInstance(2, "PRIUS", p1);
		game2.tryPlay(Letters.A, 0);
		game2.tryPlay(Letters.P, 0);
		game2.tryPlay(Letters.R, 1);
		game2.tryPlay(Letters.I, 2);
		game2.tryPlay(Letters.A, 3);
		game2.tryPlay(Letters.B, 3);
		game2.tryPlay(Letters.C, 3);
		game2.tryPlay(Letters.D, 3);
		game2.tryPlay(Letters.U, 3);
		game2.tryPlay(Letters.S, 4);

	}
}
