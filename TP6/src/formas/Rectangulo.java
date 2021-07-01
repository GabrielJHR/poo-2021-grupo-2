package formas;

public class Rectangulo extends Forma {
	private double ladoMayor;
	private double ladoMenor;
	
	public Rectangulo(String color, String nombre, double ladoMayor, double ladoMenor) {
		super(color, (ladoMayor / 2.0), (ladoMenor / 2.0), nombre);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	@Override
	public double calcularArea() {
		return this.ladoMayor * this.ladoMenor;
	}
	
	public double perimetro() {
		return (this.ladoMenor * 2) + (this.ladoMayor * 2);
	}
	
	public void cambiarTamanio(double factor) {
		this.ladoMayor *= factor;
		this.ladoMenor *= factor;
		super.moverFigura(this.ladoMayor / 2 , this.ladoMenor / 2);
	}
	
	@Override
	public String imprimir() {
		return super.imprimir() + " " + "Rectangulo [ladoMayor=" + ladoMayor + ", ladoMenor=" + ladoMenor + "]";
	}
	
	
}
