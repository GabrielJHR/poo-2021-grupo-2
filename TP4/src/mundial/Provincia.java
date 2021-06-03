package mundial;

public class Provincia {

	private String nombre;
	private Pais pais;
	
	public Provincia() {
		super();
	}

	public Provincia(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Pais getPais() {
		return pais;
	}



	public void setPais(Pais pais) {
		this.pais = pais;
	}



	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", pais=" + pais + "]";
	}
	
	
	
	
}