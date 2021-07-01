package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PruebaJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Juego juego = new Juego();
		Mazo mazo = new Mazo();
		List<Naipe> sacados = new ArrayList<Naipe>();
		List<Jugador> acertados = new ArrayList<Jugador>();
		
		int cantidadJugadores = 0;
		int puntosParaGanar;
		int rebarajes;
		int contRebarajes = 0;
		int elegirNumero;
		String elegirPalo;
		
		do {
			System.out.println("Cantidad de jugadores (2 o mas): ");
			cantidadJugadores = sc.nextInt();
		}while(cantidadJugadores < 2);
		
		
		for(int i = 0; i < cantidadJugadores; i++) {
			jugadores.add(new Jugador(i+1));
		}
		
		System.out.println("Cantidad de puntos para ganar: ");
		puntosParaGanar = sc.nextInt();
		
		System.out.println("Cantidad de rebarajes: ");
		rebarajes = sc.nextInt();
		
		
		System.out.println("Elegir naipe");
		int i = 0;
		
		for (Jugador jugador : jugadores) {
			System.out.println("Jugador " + jugador.getNombre());
			jugador.elegirCarta(JuegoService.elegirNaipe());
			System.out.println();
		}
		
		while ((!JuegoService.verificarGanador(jugadores, puntosParaGanar)) && (rebarajes >= contRebarajes)) {
			if(mazo.getCantidad() > juego.LIMITE) {
				sacados.add(mazo.sacarNaipeArriba());
				System.out.println(sacados.get(sacados.size() - 1));
				
				for (Jugador jugador : jugadores) {
					if(sacados.get(sacados.size() - 1).equals(jugador.getCartaElegida())) {
						System.out.println("El jugador " + jugador.getNombre() + "debe elegir otra carta.");
						jugador.setPuntaje(jugador.getPuntaje()+1);
						jugador.elegirCarta(JuegoService.elegirNaipe());
					}
				}
			}else {
				sacados.clear();
				mazo.rebaraja();
				contRebarajes++;
			}
			
		}
		
		Collections.sort(jugadores);
		
		System.out.println("Ranking de puntajes");
		for (Jugador jugador : jugadores) {
			System.out.println("Jugador " + jugador.getNombre() + ": " + jugador.getPuntaje());
		}
		
		sc.close();
		
	}

}
