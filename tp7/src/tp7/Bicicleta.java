package tp7;

public class Bicicleta implements ImpactoEcologico
{
	Integer cantidadRueda;
	
	

	public Bicicleta(Integer cantidadRueda) {
		super();
		this.cantidadRueda = cantidadRueda;
	}
	
	
	
	public Integer getCantidadRueda() {
		return cantidadRueda;
	}



	public void setCantidadRueda(Integer cantidadRueda) {
		this.cantidadRueda = cantidadRueda;
	}


	@Override
	public String obtenerImpactoEcologico() 
	{
		return "Bajo";
	}


	@Override
	public String toString() 
	{
		return "Bicicleta [cantidadRueda=" + cantidadRueda + "]";
	}
	
	
	
}
