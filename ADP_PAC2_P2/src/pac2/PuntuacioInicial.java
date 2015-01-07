package pac2;

public class PuntuacioInicial implements IPuntuacio {
	int valor;
	static PuntuacioInicial instancia;

	private PuntuacioInicial() {
		inicialitzar();
	}

	@Override
	public void puntuar(Letters a, Cell celda) {
		if (!celda.isRightGuess()) {
			if (a.equals(celda.getCorrectLetter())) {
				valor += 10;
				celda.setRightGuess(true);
			} else {
				celda.addErrorLetter(a);
			}
		}
	}

	@Override
	public int getPuntuacio() {
		return valor;
	}

	public static PuntuacioInicial getInstancia() {
		if (instancia == null) {
			instancia = new PuntuacioInicial();
		}
		return instancia;
	}

	@Override
	public void inicialitzar() {
		valor = 0;
	}

}
