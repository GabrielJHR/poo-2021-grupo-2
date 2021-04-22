package ejercicio6;

public class Entero {
	private int numero;
	
	//constructor de la clase Enteros
	public Entero(int numero) {
		super();
		this.numero = numero;
	}
	
	public Entero() {};
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Devuelve si es par o no
	public boolean esPar() {
		if(this.numero % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esPrimo() {
		
		for(int i = this.numero - 1; i > 1; i++) {
			if(this.numero % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	//calcula el cuadrado de n
	public long cuadrado(){
		return numero*numero;
	}
}
