package cartas;

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
		
		sc.close();
		
		return new Naipe(elegirNumero, Enum.valueOf(Palo.class, elegirPalo));
	}
}
