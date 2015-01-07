package pac2;

public class Puntuacio {
	IPuntuacio puntuacio;
	static Puntuacio instancia = null;

	public Puntuacio(int idEstrategia) {
		if (idEstrategia == 1) {
			puntuacio = PuntuacioInicial.getInstancia();
		}
		if (idEstrategia == 2) {
			puntuacio = PuntuacioSegona.getInstancia();
		}
	}

	public void puntuar(Letters a, Cell celda) {
		puntuacio.puntuar(a, celda);
	}

	public int getPuntuacio() {
		return puntuacio.getPuntuacio();
	}

}
