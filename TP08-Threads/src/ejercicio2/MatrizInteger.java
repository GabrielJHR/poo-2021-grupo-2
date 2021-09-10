package ejercicio2;

import java.util.Vector;

public class MatrizInteger{
	static final int max_row = 200;
	static final int max_col = 200;
	private Vector<Vector<Integer>> cuerpo;
	
	MatrizInteger(int rows, int cols) throws MatrizException{
		if(cols > MatrizInteger.max_col) {
			throw new MatrizException("El numero de columnas excede el maximo de columnas permitidas por la matriz");
		}
		else if (rows > MatrizInteger.max_row) {
			throw new MatrizException("El numero de filas excede el maximo de filas permitidas por la matriz");
		}
		else if (rows <= 0) {
			throw new MatrizException("La matriz no puede tener 0 o un numero negativo de filas");
		}
		else if (cols <= 0) {
			throw new MatrizException("La matriz no puede tener 0 o un numero negativo de columnas");
		}
		else {
			this.cuerpo = new Vector<Vector<Integer>>(rows);
			
			for(int i = 0; i < rows; i++) {
				this.cuerpo.add(new Vector<Integer>(cols));
				for(int j = 0; j < cols; j++) {
					this.cuerpo.get(i).add(new Integer(0));
				}
			}
		}
		
	}
	
	public Object setRowCol(int row, int col, Integer obj){
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
	
	public Integer getRowCol(int row, int col){
		Integer obj = new Integer(0);
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
	
	public Vector<Integer> getRow(int row){
		return this.cuerpo.get(row);
	}
	
	public Vector<Integer> getCol(int col){
		Vector<Integer> resultado = new Vector<Integer>();
		for(int i = 0; i < this.getNumRows();i++) {
			resultado.add(cuerpo.get(i).get(col));
		}
		return resultado;
	}
	
	public String getTamanio() {
		return this.cuerpo.size() + " x " + this.cuerpo.get(0).size();
	}
	
	public int getNumRows() {
		return this.cuerpo.size();
	}
	
	public int getNumCols() {
		return this.cuerpo.get(0).size();
	}

	@Override
	public String toString() {
		return "MatrizObjetos [elementos=" + cuerpo + "]";
	}
	
	
}
