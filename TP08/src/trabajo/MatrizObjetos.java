package trabajo;

import java.util.Vector;

public class MatrizObjetos{
	static final int max_row = 20;
	static final int max_col = 20;
	private Vector<Vector<Object>> cuerpo;
	
	MatrizObjetos(int rows, int cols) throws MatrizException{
		if(cols > MatrizObjetos.max_col) {
			throw new MatrizException("El numero de columnas excede el maximo de columnas permitidas por la matriz");
		}
		else if (rows > MatrizObjetos.max_row) {
			throw new MatrizException("El numero de filas excede el maximo de filas permitidas por la matriz");
		}
		else if (rows <= 0) {
			throw new MatrizException("La matriz no puede tener 0 o un numero negativo de filas");
		}
		else if (cols <= 0) {
			throw new MatrizException("La matriz no puede tener 0 o un numero negativo de columnas");
		}
		else {
			this.cuerpo = new Vector<Vector<Object>>(rows);
			
			for(int i = 0; i < rows; i++) {
				this.cuerpo.add(new Vector<Object>(cols));
				for(int j = 0; j < cols; j++) {
					this.cuerpo.get(i).add(new Object());
				}
			}
		}
		
	}
	
	public Object setRowCol(int row, int col, Object obj){
		try {
			this.cuerpo.get(row).set(col, obj);
		}
		catch(Exception e){
			System.out.println("Error: no se pudo agregar el elemento");
			System.out.println(e);
		}
		finally{
			return obj;
		}
	}
	
	public Object getRowCol(int row, int col){
		Object obj = new Object();
		try {
			obj = this.cuerpo.get(row).get(col); 
		}
		catch(Exception e){
			System.out.println("Error: "+e ); 
		}
		finally {
			return obj; 
		}
	}
	
	public String getTamanio() {
		return this.cuerpo.size() + " x " + this.cuerpo.get(0).size();
	}

	@Override
	public String toString() {
		return "MatrizObjetos [elementos=" + cuerpo + "]";
	}
	
	
}
