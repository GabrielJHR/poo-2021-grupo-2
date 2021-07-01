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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Naipe other = (Naipe) obj;
		if (numero != other.numero)
			return false;
		if (palo != other.palo)
			return false;
		return true;
	}

}
