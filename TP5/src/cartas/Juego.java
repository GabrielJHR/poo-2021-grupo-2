package cartas;

public class Juego {
	final int LIMITE = 20;
	private int puntajeGanador;
	
	public Juego(int puntajeGanador) {
		super();
		this.puntajeGanador = puntajeGanador;
	}

	public Juego() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getPuntajeGanador() {
		return puntajeGanador;
	}

	public void setPuntajeGanador(int puntajeGanador) {
		this.puntajeGanador = puntajeGanador;
	}
	
	

}
