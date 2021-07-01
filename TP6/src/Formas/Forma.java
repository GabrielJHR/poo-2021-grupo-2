package Formas;

import java.util.Arrays;

public abstract class Forma {
	private String color;
	private double[] coordenadas;
	private String nombre;
	
	public Forma(String color, double x, double y, String nombre) {
		super();
		this.coordenadas = new double[2];
		this.color = color;
		this.coordenadas[0] = x;
		this.coordenadas[1] = y;
		this.nombre = nombre;
	}
	
	public String imprimir() {
		return "Forma [color=" + color + ", coordenadas=" + Arrays.toString(coordenadas) + ", nombre=" + nombre + "]";
	}
	
	public void moverFigura(double x, double y) {
		this.coordenadas[0] = x;
		this.coordenadas[1] = y;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double[] getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(double[] coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
