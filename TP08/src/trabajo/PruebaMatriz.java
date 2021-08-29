package trabajo;

public class PruebaMatriz {

	public static void main(String[] args) throws MatrizException {
		MatrizObjetos matriz;
		
		try {
			matriz = new MatrizObjetos(21, 10);
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
			matriz = new MatrizObjetos(MatrizObjetos.max_row, MatrizObjetos.max_col);
		}
		
		System.out.println("Intentando agregar un elemento en (21,1)...");
		Object res1 = matriz.setRowCol(21, 1, "Tira error");
		System.out.println(res1);
		
		System.out.println("Intentando agregar un elemento en (3,1)...");
		Object res2 = matriz.setRowCol(3, 1, "No tira error");
		System.out.println(res2);
		
	}
	
	
}
