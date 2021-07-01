package Formas;

public class Prueba {

	public static void main(String[] args) {
		
		Rectangulo rectangulo1 = new Rectangulo("rojo", "rectangulo1", 4, 2);
		
		System.out.println(rectangulo1.imprimir());
		
		System.out.println("Area: " + rectangulo1.calcularArea());
		
		System.out.println("Perimetro: " + rectangulo1.perimetro());
		
		System.out.println("Color: " + rectangulo1.getColor());
		
		rectangulo1.cambiarTamanio(2);
		
		System.out.println(rectangulo1.imprimir());
		
		rectangulo1.moverFigura(1, 1);
		rectangulo1.setColor("azul");
		
		System.out.println(rectangulo1.imprimir());
	}

}
