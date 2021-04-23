package ejercicio4;

import java.util.Arrays;

public class PruebaArrays {

	public static void main(String[] args) {
		int[] numeros = {4,2,3,8,1};
	
		mostrar(numeros);
		
		
	}
	
	public static void mostrar(int[] vector) {
		
		System.out.println("Arreglo: " + Arrays.toString(vector));
		
		System.out.println("Ordenar de Menor a mayor"  + Arrays.toString(menorMayor(vector)));
		
		System.out.println("Ordenar de Mayor a Menor"  + Arrays.toString(mayorMenor(vector)));
		
		System.out.println("Promedio: "  + promedio(vector));
		
		System.out.println("Tamaño del arreglo: " + vector.length);
		
		System.out.println("Mayor: " + mayor(vector));
		
	}
	

	public static int[] menorMayor(int[] vector) {
		int aux;
		
		for(int i = 0; i <= 3; i++ ) {
			
			for(int j = i+1; j <= 4; j++ ) {
				
				if (vector[i] > vector[j]) {
					aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	return vector;	
	}
	
	public static int[] mayorMenor(int[] vector) {
		int aux;
		
		for(int i = 0; i <= vector.length; i++ ) {
			
			for(int j = i+1; j <= vector.length-1; j++ ) {
				
				if (vector[i] < vector[j]) {
					aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	return vector;	
	}
	
	public static double promedio(int[] vector) {
		int acomulador = 0;
		for (int i = 0; i < vector.length ; i++) {
			acomulador += vector[i];
			
		}
		return acomulador/vector.length;
	}
	
	
	public static int mayor(int[] vector) {
		int aux = 0;
		for (int i=0; i < vector.length ; i++) {
			if (aux < vector[i]) {
				aux = vector[i];
			}
		}
		return aux;
	}
	
}
