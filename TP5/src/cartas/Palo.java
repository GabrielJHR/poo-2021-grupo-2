package cartas;

public enum Palo {
	ORO("Oro", "O"),
	ESPADA("Espada", "E"),
	BASTO("Basto", "B"),
	COPA("Copa", "C");
	
	private String nombre;
	private String simbolo;
	
	private Palo( String nombre, String simbolo) {
		this.nombre = nombre;
		this.simbolo = simbolo;
	}
	
	
}
