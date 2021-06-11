package ejercicio2;

import java.util.Scanner;

public class Producto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero1;
		double numero2;
		double numero3;
		char seguir;
		
		do {
		
			System.out.print("Primera numero: ");
			numero1 = teclado.nextDouble();
			System.out.print("Segunda numero: ");
			numero2 = teclado.nextDouble();
			System.out.print("Tercera numero: ");
			numero3 = teclado.nextDouble();
			
			if (numero1 > 0) {
				numero1 = numero1+numero2+numero3;
				System.out.println("Se realizo la operacion producto, cuyo resultado es: " +numero1);
			}else {
				numero1 = numero1*numero2*numero3;
				System.out.println("Se realizo la operacion suma, cuyo resultado es: " +numero1);
			}
			
			System.out.println("¿Desea hacer otra operacion?");
			
			seguir = teclado.next().charAt(0);
		}
		while(seguir != 'n');
		teclado.close();
		
	}
	
}
