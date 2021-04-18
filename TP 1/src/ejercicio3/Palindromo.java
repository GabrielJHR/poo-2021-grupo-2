package ejercicio3;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		
		System.out.println("Ingresar cadena: ");
		cadena = sc.next();
		
		//Convertir cadena a minusculas y compararlo con la cadena invertida
		if (cadena.toLowerCase().equals(invertirCadena(cadena).toLowerCase())) {
			System.out.println("La palabra "+ cadena + " es palindromo.");
		}
		else {
			System.out.println("La palabra "+ cadena + " no es palindromo.");
		}
		
		sc.close();

	}
	
	/**
	 * Este metodo recibe como parametro una cadena y retorna la misma cadena invertida
	 * @param cadena Es la cadena que va a ser invertida
	 * @return String
	 * @author Grupo 2
	 */
	public static String invertirCadena(String cadena) {
		int i;
		String cadenaInvertida = "";
		
		for(i = cadena.length() - 1; i >= 0  ; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		
		return cadenaInvertida;
		
	}

}
