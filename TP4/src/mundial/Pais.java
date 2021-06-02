package mundial;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	private String nombre;
	private String capital;
	
	private  Continente continente;
	private  List<Provincia> provincias;
	private  List<Pais> limitrofes;
	
	

	public Pais() {
		super();
		this.provincias = new ArrayList<Provincia>();
		this.limitrofes = new ArrayList<Pais>();
	}


	public Pais(String nombre, String capital, Continente continente, List<Provincia> provincias) {
		super();
		this.nombre = nombre;
		this.capital = capital;
		this.continente = continente;
		this.provincias = provincias;
	}


	public List<Pais> getLimitrofes() {
		return limitrofes;
	}


	public void setLimitrofes(List<Pais> limitrofes) {
		this.limitrofes = limitrofes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	public Continente getContinente() {
		return continente;
	}


	public void setContinente(Continente continente) {
		this.continente = continente;
	}


	public List<Provincia> getProvincias() {
		return provincias;
	}


	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}


	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", capital=" + capital + ", continente=" + continente + ", provincias="
				+ provincias + "]";
	}


	
	
	
	
}
