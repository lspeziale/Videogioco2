package it.dstech.model;

import java.util.Scanner;

public class SceltaPersonaggio {

	public IPersonaggio scelta(boolean a) {
		int scelta;
		IPersonaggio pg1 = null;
		String tipoUtente;
		do {
			if (a) {
				
				System.out.println("Scegli il personaggio.\n\t1: Goku\n\t2: Vegeta");
				Scanner in = new Scanner(System.in);
				scelta = in.nextInt();
				tipoUtente=" (PL1)";
			} else {
				
				scelta = ((int) (Math.random() * 2) + 1);
				tipoUtente=" (COM)";
			}
			switch (scelta) {
			case 1:
				pg1 = new Goku();
				pg1.setNomePersonaggio(pg1.getNomePersonaggio()+ tipoUtente);
				break;
			case 2:
				pg1 = new Vegeta();
				pg1.setNomePersonaggio(pg1.getNomePersonaggio()+ tipoUtente);
				break;
			default:
				System.out.println("ERRORE: Inserisci un numero valido");
			}

		} while (scelta != 1 && scelta != 2);
		return pg1;
	}
}
