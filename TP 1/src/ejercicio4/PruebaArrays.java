package ejercicio4;

import java.util.Arrays;

public class PruebaArrays {

	public static void main(String[] args) {
		
		int[] numeros = {4,2,3,8,1};
		
		mostrarEnPantalla(numeros);

	}
	
	public static void mostrarEnPantalla(int[] arreglo) {
		
		System.out.println("Arreglo: " + Arrays.toString(arreglo));
		
		System.out.println("La cantidad de elementos del arreglo es: " + arreglo.length);
		
		System.out.println("El mayor numero del arreglo es: " + mayor(arreglo));
		
		System.out.println("El promedio de valores del arreglo es: " + promedio(arreglo));
		
		System.out.println("Arreglo de menor a mayor: " + Arrays.toString(menorAMayor(arreglo)));
		
		System.out.println("Arreglo de mayor a menor: " + Arrays.toString(mayorAMenor(arreglo)));
		
	}
	
	public static int[] menorAMayor(int[] arreglo) {
		boolean orden = false;
		int i, aux;
		
		while (orden != true) {
			orden = true;
			
			for (i = 0; i < arreglo.length - 1; i++) {
				if (arreglo[i] > arreglo[i+1]) {
					orden = false;
					aux = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = aux;
				}
			}
		}
		
		return arreglo;
	}
	
	public static int[] mayorAMenor(int[] arreglo) {
		
		boolean orden = false;
		int i, aux;
		
		while (orden != true) {
			orden = true;
			
			for (i = 0; i < arreglo.length - 1; i++) {
				if (arreglo[i] < arreglo[i+1]) {
					orden = false;
					aux = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = aux;
				}
			}
		}
		
		return arreglo;
	}
	
	public static int mayor(int[] arreglo) {
		int mayor = arreglo[0];
		int i;
		
		for (i = 0; i < arreglo.length; i++) {
			if (arreglo[i] > mayor) {
				mayor = arreglo[i];
			}
		}
		
		return mayor;		
	}
	
	public static double promedio(int[] arreglo) {
		double total = 0;
		int i;
		
		for (i = 0; i < arreglo.length; i++) {
			total += arreglo[i];
		}
		
		return total / arreglo.length;
		
	}

}
