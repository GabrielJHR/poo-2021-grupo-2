package mundial;

import java.util.List;
import java.util.ArrayList;

public class MapaMundial {
	
	private List<Continente> continentes;

	public MapaMundial() {
		super();
		this.continentes = new ArrayList<Continente>();
		
		//Crear continentes
		Continente america = new Continente();
		Continente europa = new Continente();
		Continente asia = new Continente();
		Continente oceania = new Continente();
		Continente africa = new Continente();
		
		america.setNombre("America");
		europa.setNombre("Europa");
		asia.setNombre("Asia");
		oceania.setNombre("Oceania");
		africa.setNombre("Africa");
		
		//Crear paises
		Pais argentina = new Pais();
		Pais uruguay = new Pais();
		Pais brasil = new Pais();
		Pais chile = new Pais();
		Pais paraguay = new Pais();
		Pais bolivia = new Pais();
		Pais francia = new Pais();
		Pais italia = new Pais();
		Pais portugal = new Pais();
		Pais espania = new Pais();
		
		argentina.setNombre("Argentina");
		uruguay.setNombre("Uruguay");
		brasil.setNombre("Brasil");
		chile.setNombre("Chile");
		paraguay.setNombre("Paraguay");
		bolivia.setNombre("Bolivia");
		francia.setNombre("Francia");
		italia.setNombre("Italia");
		portugal.setNombre("Portugal");
		espania.setNombre("España");
		
		//Crear provincias
		Provincia entreRios = new Provincia("Entre Rios", argentina);
		Provincia buenosAires = new Provincia("Buenos Aires", argentina);
		Provincia salta = new Provincia("Salta", argentina);
		Provincia santaFe = new Provincia("Santa Fe", argentina);
		Provincia corrientes = new Provincia("Corrientes", argentina);
		Provincia cordoba = new Provincia("Cordoba", argentina);
		
		Provincia maldonado = new Provincia("Maldonado", uruguay);
		Provincia paysandu = new Provincia("Paysandú", uruguay);
		Provincia rocha = new Provincia("Rocha", uruguay);
		Provincia canelones = new Provincia("Canelones", uruguay);
		
		
		//Asignar provincias a los paises
		List<Provincia> provinciasArg = new ArrayList<Provincia>();
		List<Provincia> provinciasUy = new ArrayList<Provincia>();
		
		provinciasArg.add(entreRios);
		provinciasArg.add(buenosAires);
		provinciasArg.add(salta);
		provinciasArg.add(santaFe);
		provinciasArg.add(corrientes);
		provinciasArg.add(cordoba);
		
		provinciasUy.add(maldonado);
		provinciasUy.add(paysandu);
		provinciasUy.add(rocha);
		provinciasUy.add(canelones);
		
		argentina.setProvincias(provinciasArg);
		uruguay.setProvincias(provinciasUy);
		
		//Asignar paises a los continentes
		List<Pais> paisesAmerica = new ArrayList<Pais>();
		List<Pais> paisesEuropa = new ArrayList<Pais>();
		
		paisesAmerica.add(argentina);
		paisesAmerica.add(brasil);
		paisesAmerica.add(uruguay);
		paisesAmerica.add(chile);
		paisesAmerica.add(paraguay);
		paisesAmerica.add(bolivia);
		
		paisesEuropa.add(espania);
		paisesEuropa.add(portugal);
		paisesEuropa.add(italia);
		paisesEuropa.add(francia);
		
		america.setPaises(paisesAmerica);
		europa.setPaises(paisesEuropa);
		
		//Agregar continentes
		this.continentes.add(america);
		this.continentes.add(europa);
		this.continentes.add(asia);
		this.continentes.add(africa);
		this.continentes.add(america);
	}

	public List<Pais> getPaises(String continenteBuscado){
		for (Continente continente : this.continentes) {
			if(continente.getNombre().equals(continenteBuscado)) {
				return continente.getPaises();
			}
		}
		
		return null;
	}
	
	public List<Provincia> getProvincias(String paisBuscado){
		for (Continente continente : this.continentes) {
			for (Pais pais : continente.getPaises()) {
				if(pais.getNombre().equals(paisBuscado)) {
					return pais.getProvincias();
				}
			}
		}
		
		return null;
	}

}
