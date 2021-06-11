package cartas;

public class Naipe {
	private int numero;
	private Palo palo;
	
	public Naipe(int numero, Palo palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	public Naipe() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Naipe: " + numero + "," + palo + "";
	}
	
	
	
	

}
