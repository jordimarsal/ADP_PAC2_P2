package pac2;

public class PuntuacioSegona implements IPuntuacio {
	private static PuntuacioSegona instancia;
	int valor;

	private PuntuacioSegona() {
		inicialitzar();
	}

	@Override
	public void puntuar(Letters a, Cell celda) {
		if (!celda.isRightGuess()) {
			if (a.equals(celda.getCorrectLetter())) {
				valor += 20;
				celda.setRightGuess(true);
			} else {
				valor -= 10;
				celda.addErrorLetter(a);
			}
		}
	}

	@Override
	public int getPuntuacio() {
		return valor;
	}

	public static PuntuacioSegona getInstancia() {
		if (instancia == null) {
			instancia = new PuntuacioSegona();
		}
		return instancia;
	}

	@Override
	public void inicialitzar() {
		valor = 0;
	}

}
