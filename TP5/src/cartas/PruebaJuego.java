package cartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Juego juego = new Juego();
		Mazo mazo = new Mazo();
		
		int cantidadJugadores = 0;
		int puntosParaGanar;
		int rebarajes;
		int elegirNumero;
		String elegirPalo;
		
		do {
			System.out.println("Cantidad de jugadores (2 o mas): ");
			cantidadJugadores = sc.nextInt();
		}while(cantidadJugadores >= 2);
		
		
		for(int i = 0; i < cantidadJugadores; i++) {
			jugadores.add(new Jugador());
		}
		
		System.out.println("Cantidad de puntos para ganar: ");
		puntosParaGanar = sc.nextInt();
		
		System.out.println("Cantidad de rebarajes: ");
		rebarajes = sc.nextInt();
		
		sc.close();
		System.out.println("Elegir naipe");
		for(int i = 0; i< cantidadJugadores; i++) {
			System.out.println("Jugador: " + jugadores.get(i).getNombre());
			jugadores.get(i).elegirCarta(JuegoService.elegirNaipe());
		}
		
		
		
		
		
		

	}

}
