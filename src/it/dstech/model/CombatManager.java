package it.dstech.model;

public class CombatManager {
	int hpA;
	int hpB;
	public boolean UTENTE= true;

	public void combatti(IPersonaggio pg1, IPersonaggio pg2) {
		int dannoA;
		int dannoB;

		do {

			if (pg1.getHpPersonaggio() <= 0) {

				System.out.println(pg2.getNomePersonaggio() + " HA VINTO.");
			} else {
				UTENTE = true;

				dannoA = calcolaDanno(pg1, pg2);
				System.out.println(" che provoca un danno di: " + dannoA);
				pg2.setHpPersonaggio(pg2.getHpPersonaggio() - dannoA);
				stampaInfo(pg1, pg2);

				if (pg2.getHpPersonaggio() <= 0) {
					System.out.println("-------------------------------");
					System.out.println(pg1.getNomePersonaggio() + " HA VINTO.");
				} else {
					UTENTE = false;
					dannoB = calcolaDanno(pg2, pg1);
					System.out.println(" che provoca un danno di: " + dannoB);
					pg1.setHpPersonaggio(pg1.getHpPersonaggio() - dannoB);
					stampaInfo(pg2, pg1);

				}

				if (pg1.getHpPersonaggio() <= 0) {
					System.out.println("-------------------------------");
					System.out.println(pg2.getNomePersonaggio() + " HA VINTO.");
				}
			}

		} while ((pg2.getHpPersonaggio() > 0) && (pg1.getHpPersonaggio() > 0));
	}

	public void stampaInfoIniziale(IPersonaggio pg1, IPersonaggio pg2) {

		System.out.print("NOME:  " + pg1.getNomePersonaggio() + " VS ");
		System.out.println("" + pg2.getNomePersonaggio());
		System.out.print("VITA:  " + pg1.getHpPersonaggio() + "\t");
		System.out.println("" + pg2.getHpPersonaggio());
		System.out.print("ATTACCO: " + pg1.getAttaccoPersonaggio() + "\t");
		System.out.println("" + pg2.getAttaccoPersonaggio());

	}

	public void stampaInfo(IPersonaggio pg1, IPersonaggio pg2) {

		System.out.println("ATTACCA " + pg1.getNomePersonaggio() + " - " + pg1.getHpPersonaggio());
		System.out.println("SUBISCE " + pg2.getNomePersonaggio() + " - " + pg2.getHpPersonaggio());

	}

	public void stampaInfoFinale(IPersonaggio pg1, IPersonaggio pg2) {

		System.out.print("" + pg1.getNomePersonaggio() + " VS ");
		System.out.println("" + pg2.getNomePersonaggio());
		if (pg1.getHpPersonaggio() < 0) {
			System.out.print("0" + "\t");
		} else {
			System.out.print(pg1.getHpPersonaggio() + "\t");
		}
		if (pg2.getHpPersonaggio() < 0) {
			System.out.println("0");
		} else {
			System.out.print(pg2.getHpPersonaggio() + "\t");
		}
	}

	public int calcolaDanno(IPersonaggio pg1, IPersonaggio pg2) {

		int danno;
		if (UTENTE == true) {
			danno = pg1.mossaUtente() - pg2.getDifesaPersonaggio();
		} else {
			danno = pg1.mossa() - pg2.getDifesaPersonaggio();
		}
		return danno;

	}

}
