package cartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoService {
	static Naipe elegirNaipe() {
		Scanner sc = new Scanner(System.in);
		int elegirNumero;
		String elegirPalo;
		
		System.out.println("Numero: ");
		elegirNumero = sc.nextInt();
		
		System.out.println("Palo (BASTO, ORO, COPA, ESPADA): ");
		elegirPalo = sc.next();
		
		
		return new Naipe(elegirNumero, Enum.valueOf(Palo.class, elegirPalo));
	}
	static boolean verificarGanador(List<Jugador> jugadores, int puntajeganador ) {
		for (Jugador jugador : jugadores) {
			if (jugador.getPuntaje() >= puntajeganador) {
				return true;
			}
		}
		return false;
	}
}
