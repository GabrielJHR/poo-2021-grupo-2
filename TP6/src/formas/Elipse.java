package formas;

public class Elipse extends Forma{
	private double radioMayor;
	private double radioMenor;
	
	
	public Elipse(String color, String nombre, double radioMayor, double radioMenor) {
		super(color,radioMayor, radioMenor, nombre);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	@Override
	public double calcularArea() {
		return 3.14 *this.radioMayor * this.radioMenor;
	}
	

}
