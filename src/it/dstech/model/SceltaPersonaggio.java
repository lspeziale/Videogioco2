package it.dstech.model;

import java.util.Scanner;

public class SceltaPersonaggio {

	public IPersonaggio scelta(boolean a) {
		int scelta;
		IPersonaggio pg1 = null;

		do {
			if (a) {
				System.out.println("Scegli il personaggio.\n\t1: Goku\n\t2: Vegeta");
				Scanner in = new Scanner(System.in);
				scelta = in.nextInt();
			} else {
				scelta = ((int) (Math.random() * 2) + 1);
			}
			switch (scelta) {
			case 1:
				pg1 = new Goku();
				break;
			case 2:
				pg1 = new Vegeta();
				break;
			default:
				System.out.println("ERRORE: Inserisci un numero valido");
			}

		} while (scelta != 1 && scelta != 2);
		return pg1;
	}
}
