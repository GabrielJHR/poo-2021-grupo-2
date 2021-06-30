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
		List<Naipe> sacados = new ArrayList<Naipe>();
		List<Jugador> acertados = new ArrayList<Jugador>();
		
		int cantidadJugadores = 0;
		int puntosParaGanar;
		int rebarajes;
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
		
		
		
		while (!JuegoService.verificarGanador(jugadores, puntosParaGanar)) {
			sacados.add(mazo.sacarNaipeArriba());
			while (i < cantidadJugadores && mazo.getCantidad() > juego.LIMITE ){
				System.out.println("Jugador: " + jugadores.get(i).getNombre());
				jugadores.get(i).elegirCarta(JuegoService.elegirNaipe());
				if (jugadores.get(i).getCartaElegida().equals(sacados.get(sacados.size()-1))) {
					jugadores.get(i).setPuntaje(jugadores.get(i).getPuntaje()+1);
				}
				i++;
			}
		}
		sc.close();
		
		
		
		
		

	}

}
