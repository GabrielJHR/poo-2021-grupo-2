package trabajo;

public class Empleado {
	private Integer legajo;
	private String nombre;
	private Integer sueldo;

	public Empleado (String nombre, Integer sueldo) throws StringException, EnteroPositivoException {	
		if((nombre.trim().length() <= 3) || (nombre == null)){
			throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.");
		}
		else if((sueldo <= 0) || (sueldo == null)) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
		}
		else {
			this.nombre = nombre;
			this.sueldo = sueldo;
		}
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) throws EnteroPositivoException {
		if((legajo <= 0) || (legajo == null)) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
		}
		else {
			this.legajo = legajo;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws StringException {
		if ((nombre.trim().length() <= 3) || (nombre == null)){
			throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.");
		}
		else {
			this.nombre = nombre;
		}
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) throws EnteroPositivoException {
		if((sueldo <= 0) || (sueldo == null)) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
		}
		else {
			this.sueldo = sueldo;
		}
	}

	public String getSueldoString() {
		return "$" + sueldo;
	}

}
