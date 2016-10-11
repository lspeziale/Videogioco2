package it.dstech.model;

public class CombatManager {
	int hpA;
	int hpB; 
	public void combatti(IPersonaggio pg1, IPersonaggio pg2) {
		int dannoA = pg1.mossa() - pg2.getDifesaPersonaggio();
		int dannoB = pg2.mossa() - pg1.getDifesaPersonaggio();
		hpA = pg1.getHpPersonaggio();
		hpB = pg2.getHpPersonaggio();
		do {

			if (hpA <= 0) {
				System.out.println(pg1.getNomePersonaggio() + " è morto.");
			} else {

				hpB = hpB - dannoA;
				System.out.println("-------------------------------");
				System.out.println("ATTACCA " + pg1.getNomePersonaggio() + " - " + hpA);
				System.out.println("SUBISCE " + pg2.getNomePersonaggio() + " - " + hpB);

				if (hpB <= 0) {
					System.out.println(pg2.getNomePersonaggio() + " è morto.");
				} else {

					hpA = (hpA - dannoB);
					System.out.println("-------------------------------");
					System.out.println("ATTACCA " + pg2.getNomePersonaggio() + " - " + hpB);
					System.out.println("SUBISCE " + pg1.getNomePersonaggio() + " - " + hpA);

				}
			}

		} while ((hpB > 0) && (hpA > 0));
	}

	public void stampaInfo(IPersonaggio a, IPersonaggio b) {
		System.out.print("" + a.getNomePersonaggio() + " VS ");
		System.out.println("" + b.getNomePersonaggio());
		System.out.print("" + hpA + "\t");
		System.out.println("" + hpB);
	}

}
