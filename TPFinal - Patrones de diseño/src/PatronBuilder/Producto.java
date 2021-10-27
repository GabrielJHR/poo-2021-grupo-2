package PatronBuilder;

public class Producto {
	
	private String masa;
	private String salsa;
	private String parmesano;
	private String mozzarella;
	private String cebolla;
	private String paleta;
	private String aceitunas;
	private String tomate;
	
	
	
	public Producto() {
		
	}

	public void setMasa(String masa) {
		this.masa = masa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}


	public void setParmesano(String parmesano) {
		this.parmesano = parmesano;
	}

	public void setMozzarella(String mozzarella) {
		this.mozzarella = mozzarella;
	}

	public void setCebolla(String cebolla) {
		this.cebolla = cebolla;
	}

	public void setPaleta(String paleta) {
		this.paleta = paleta;
	}

	public void setAceitunas(String aceitunas) {
		this.aceitunas = aceitunas;
	}

	public void setTomate(String tomate) {
		this.tomate = tomate;
	}

	@Override
	public String toString() {
		return "Producto [masa=" + masa + ", salsa=" + salsa + ", parmesano=" + parmesano + ", mozzarella=" + mozzarella
				+ ", cebolla=" + cebolla + ", paleta=" + paleta + ", aceitunas=" + aceitunas + ", tomate=" + tomate
				+ "]";
	}
	
	
}
