package cartas;

public class Jugador implements Comparable<Jugador> {
	
	private int nombre;
	private int puntaje;
	private Naipe cartaElegida;
	
	public Jugador(Integer nombre) {
		super();
		this.nombre = nombre;
		this.puntaje = 0;
	}
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void elegirCarta( Naipe naipe ) {
		this.cartaElegida = naipe;
	}
	
	public Naipe getCartaElegida() {
		return this.cartaElegida;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Jugador [nombre= Jugador " + nombre + ", puntaje=" + puntaje + "]";
	}
	
	@Override
    public int compareTo(Jugador jugador) 
    {

        if (puntaje > jugador.puntaje) 
        {
            return -1;
        }
        if (puntaje < jugador.puntaje) 
        {
            return 1;
        }

        return 0;
    }
	
	
	
	
	

}
