package mundial;

import java.util.ArrayList;
import java.util.List;

public class Continente {

	private String nombre;
	private List<Pais> paises;
	
	public Continente(String nombre, ArrayList<Pais> paises) {
		super();
		this.paises.addAll(paises);
		this.nombre = nombre;
	}
	
	public Continente() {
		super();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public  List<Pais> getPaises() {
		return paises;
	}


	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}

	@Override
	public String toString() {
		return "Continente [nombre=" + nombre + ", paises=" + paises + "]";
	}
	
}
