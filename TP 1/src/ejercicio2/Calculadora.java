package ejercicio2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		
		String opc;
		
		do {
			
			System.out.println("Ingresar el primer numero: ");
			num1 = sc.nextDouble();
			System.out.println("Ingresar el segundo numero: ");
			num2 = sc.nextDouble();
			System.out.println("Ingresar el tercer numero: ");
			num3 = sc.nextDouble();
			
			if (num1 > 0) {
				System.out.println("Producto: " + num2 + " x " + num3 + " = " + (num2 * num3));
			}
			else {
				System.out.println("Suma: " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
			}
			
			System.out.println("Volver a ejecutar el programa? (s/n)");
			opc = sc.next();
			
		}while (opc.charAt(0) == 's');
		
		

	}

}
