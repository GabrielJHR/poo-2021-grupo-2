package tp7;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) 
	{
		
		List<ImpactoEcologico> listaImpactoEcologico = new ArrayList<ImpactoEcologico>();
		
		Edificio objEdificio = new Edificio("Los Santos", "Malibu 345",300, 400);
		Auto objAuto = new Auto(0.00, 300000.0);
		Bicicleta objBicicleta = new Bicicleta(2);
		
		listaImpactoEcologico.add(objEdificio);
		listaImpactoEcologico.add(objAuto);
		listaImpactoEcologico.add(objBicicleta);
		
		for (ImpactoEcologico impactoEcologico : listaImpactoEcologico) 
		{
			System.out.println(impactoEcologico.obtenerImpactoEcologico());
		}
	}

}
