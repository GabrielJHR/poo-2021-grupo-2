package tp7;

public class Auto implements ImpactoEcologico
{
	Double kmRecorrido;
	Double cantCombustible;
	
	@Override
	public String obtenerImpactoEcologico()
	{
		double impacto = cantCombustible * 0.10;
		
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

	public Auto(Double kmRecorrido, Double cantCombustible) 
	{
		super();
		this.kmRecorrido = kmRecorrido;
		this.cantCombustible = cantCombustible;
	}
	
	

	public Double getKmRecorrido() 
	{
		return kmRecorrido;
	}

	public void setKmRecorrido(Double kmRecorrido) 
	{
		this.kmRecorrido = kmRecorrido;
	}

	public Double getCantCombustible() 
	{
		return cantCombustible;
	}

	public void setCantCombustible(Double cantCombustible) 
	{
		this.cantCombustible = cantCombustible;
	}

	@Override
	public String toString() 
	{
		return "Auto [kmRecorrido=" + kmRecorrido + ", cantCombustible=" + cantCombustible + "]";
	}

	
	
	
	
	
	
	
	
}
