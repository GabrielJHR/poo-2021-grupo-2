package ejercicio3;

import java.util.Scanner;


public class Palindromo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String cadena;
		String cadenaInvertida;
		
		System.out.println("Ingrese una cadena: ");
		
		cadena = teclado.next();		
		cadenaInvertida = invertir(cadena);
		
		System.out.println("Cadena: " + cadena);		
		System.out.println("Cadena Invertida: " + cadenaInvertida);	
		
		if (cadena.equals(cadenaInvertida)) {
			System.out.println("La cadena es Palindromo.");
		}else {
			System.out.println("La cadena no es Palindromo.");
		}
		
		teclado.close();
	}

	
	public static String invertir(String cad) {
		String cadInvertida;
		cadInvertida = "";
		for (int i = cad.length()-1; i >= 0; i--) {
			cadInvertida = cadInvertida + cad.charAt(i);
		}
		return cadInvertida;
		
		
	}
	
}
