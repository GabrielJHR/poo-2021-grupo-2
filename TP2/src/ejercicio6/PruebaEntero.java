package ejercicio6;

import java.util.Scanner;

public class PruebaEntero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Entero e = new Entero();
		
		System.out.println("Ingresar un numero entero");
		e.setNumero(sc.nextInt());
		
		System.out.println("El numero ingresado es: "+e.getNumero());
		System.out.println("El cuadrado de " + e.getNumero() + " es: " +
				e.cuadrado());
		
		if(e.esPrimo()) {
			
			if(e.esPar()) {
				System.out.println("El numero: " + e.getNumero() + " es par");
			}
			else {
				System.out.println("El numero: " + e.getNumero() + " es impar");
			}
			
			System.out.println("Factorial: " + factorial(e));
			
			
		}
	}
	
	public static long factorial(Entero numero) {
		long acumulador = numero.getNumero();
		int i;
		
		for(i = numero.getNumero() - 1; i > 1; i--) {
			acumulador += acumulador * i;
		}
		
		return acumulador;
	}
}