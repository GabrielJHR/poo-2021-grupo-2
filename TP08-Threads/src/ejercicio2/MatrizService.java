package ejercicio2;

import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class MatrizService {
	
	public MatrizService() {
		
	}
	
	public static MatrizInteger calcularProductoSimple(MatrizInteger matriz1, MatrizInteger matriz2) {
		int rowsM1 = matriz1.getNumRows();
		int colsM1 = matriz1.getNumCols();
		int rowsM2 = matriz2.getNumRows();
		int colsM2 = matriz2.getNumCols();
		
		try {
			MatrizInteger matrizResultado = new MatrizInteger(rowsM1, colsM2);
			
			for(int i = 0; i < matrizResultado.getNumRows();i++) {
				for(int j = 0; j < matrizResultado.getNumCols();j++) {
					int multiplicacion = this.multiplicacionFilaColumna(matriz1.getRow(i), matriz2.getCol(j));
					matrizResultado.setRowCol(i, j, multiplicacion);
				}
			}
			
			return matrizResultado;
		} catch (MatrizException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public static int multiplicacionFilaColumna(Vector<Integer> vector, Vector<Integer> vector2) {
		int resultado = 0;
		
		for(int i = 0; i < vector.size(); i++) {
			resultado += vector.get(i) * vector2.get(i);
		}
		
		return resultado;
	}
	
	public static void generarMatrizAleatoria(MatrizInteger matriz) {
		for(int i = 0; i < matriz.getNumRows(); i++) {
			for(int j = 0; j < matriz.getNumCols(); j++) {
				int randomNum = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
				matriz.setRowCol(i, j, randomNum);
			}
		}
		
	}
}
