package it.dstech.model;

public class CombatManager {
	public void combatti(IPersonaggio a, IPersonaggio b) {
		int dannoA = a.mossa() - b.getDifesaPersonaggio();
		int dannoB = b.mossa() - a.getDifesaPersonaggio();
		int hpA = a.getHpPersonaggio();
		int hpB = b.getHpPersonaggio();
		do {

			if (hpA <= 0) {
				System.out.println(a.getNomePersonaggio() + " è morto.");
			} else {

				hpB = hpB - dannoA;
				System.out.println("-------------------------------");
				System.out.println("ATTACCA " + a.getNomePersonaggio() + " - " + hpA);
				System.out.println("SUBISCE " + b.getNomePersonaggio() + " - " + hpB);

				if (hpB <= 0) {
					System.out.println(b.getNomePersonaggio() + " è morto.");
				} else {

					hpA = (hpA - dannoB);
					System.out.println("-------------------------------");
					System.out.println("ATTACCA " + b.getNomePersonaggio() + " - " + hpB);
					System.out.println("SUBISCE " + a.getNomePersonaggio() + " - " + hpA);

				}
			}

		} while ((hpB > 0) && (hpA > 0));
	}

	public void stampaInfo(IPersonaggio a, IPersonaggio b) {
		System.out.print("" + a.getNomePersonaggio() + " VS ");
		System.out.println("" + b.getNomePersonaggio());
		System.out.print("" + a.getHpPersonaggio() + "\t");
		System.out.println("" + b.getHpPersonaggio());
	}

}
