package tp7;

public class Edificio implements ImpactoEcologico
{
	String nombre;
	String direccion;
	Integer altura;
	Integer ancho;
	
	
	
	public Edificio(String nombre, String direccion, Integer altura, Integer ancho) 
	{
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.altura = altura;
		this.ancho = ancho;
	}



	@Override
	public String obtenerImpactoEcologico()
	{
		double impacto = altura * ancho * 2;
		
		if(impacto < 20000) 
		{
			return "Bajo";
		}
		else if(impacto >= 20000 && impacto < 60000)
		{
			return "Medio";
		}else 
		{
			return "Alto";
		}
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public Integer getAltura() {
		return altura;
	}



	public void setAltura(Integer altura) {
		this.altura = altura;
	}



	public Integer getAncho() {
		return ancho;
	}



	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}



	@Override
	public String toString() 
	{
		return "Edificio [nombre=" + nombre + ", direccion=" + direccion + ", altura=" + altura + ", ancho=" + ancho
				+ "]";
	}

}
