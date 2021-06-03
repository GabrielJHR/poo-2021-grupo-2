package mundial;

import java.util.List;
import java.util.Scanner;

public class MapaMundi {

	public static void main(String[] args) {
		MapaMundial mapa = new MapaMundial();
		
		Scanner sc = new Scanner(System.in);
		
		String nombreContinente;
		String nombrePais;
		int opc;
		
		System.out.println("1- Buscar continente");
		System.out.println("2- Buscar pais");
		
		opc = sc.nextInt();
		
		switch (opc) {
		case 1 :
			System.out.print("Nombre del continente: ");
			nombreContinente = sc.next();
			System.out.println("Paises: ");
			mostrarPaises(mapa.getPaises(nombreContinente));
			break;
			
		case 2 :
			System.out.print("Nombre del pais: ");
			nombrePais = sc.next();
			System.out.println("Provincias: ");
			mostrarProvincias(mapa.getProvincias(nombrePais));
			break;
			
		}
		
		sc.close();
	}
	
	public static void mostrarPaises(List<Pais> paises) {
		for (Pais pais : paises) {
			System.out.println(pais.getNombre());
		}
	}
	
	public static void mostrarProvincias(List<Provincia> provincias) {
		for (Provincia provincia : provincias) {
			System.out.println(provincia.getNombre());
		}
	}

}
