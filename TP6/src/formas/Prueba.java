package formas;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		
		List<Forma> figuras = new ArrayList();
		
		
		Rectangulo rectangulo1 = new Rectangulo("rojo", "rectangulo1", 4, 2);
		Elipse elipse1 = new Elipse("azul","elipse1",5,2);
		Cuadrado cuadrado1 = new Cuadrado("verde","cuadrado1",4);
		Circulo circulo1 = new Circulo("amarillo","circulo1",6);
		
		figuras.add(elipse1);
		figuras.add(rectangulo1);
		figuras.add(cuadrado1);
		figuras.add(circulo1);
		
		
		System.out.println(rectangulo1.imprimir());
		
		System.out.println("Area: " + rectangulo1.calcularArea());
		
		System.out.println("Perimetro: " + rectangulo1.perimetro());
		
		System.out.println("Color: " + rectangulo1.getColor());
		
		rectangulo1.cambiarTamanio(2);
		
		System.out.println(rectangulo1.imprimir());
		
		rectangulo1.moverFigura(1, 1);
		rectangulo1.setColor("azul");
		
		System.out.println(rectangulo1.imprimir());
		
		
		for (Forma forma : figuras) {
			forma.setColor("naranja");
			forma.moverFigura(2, 2);;
			System.out.println(forma.imprimir() );
			System.out.println(forma.calcularArea() );
		}
		
	}

}
