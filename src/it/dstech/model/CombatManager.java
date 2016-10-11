package it.dstech.model;

public class CombatManager {
	public void combatti(IPersonaggio a, IPersonaggio b) {
		int dannoA = a.mossa() - b.getDifesaPersonaggio();
		int dannoB = b.mossa() - a.getDifesaPersonaggio();
		int hpA=a.getHpPersonaggio();
		int hpB=b.getHpPersonaggio();
		do{
			hpB = hpB - dannoA;
			System.out.println("" + a.getNomePersonaggio()+" - "+hpA);
			System.out.println("" + b.getNomePersonaggio()+" - "+hpB);
			if(b.getHpPersonaggio()<=0){
				System.out.println(b.getNomePersonaggio()+" è morto.");
				System.exit(0);
			}			
			hpA=(hpA - dannoB);
			System.out.println("" + b.getNomePersonaggio()+" - "+hpB);
			System.out.println("" + a.getNomePersonaggio()+" - "+hpA);
			if(a.getHpPersonaggio()<=0){
				System.out.println(a.getNomePersonaggio()+" è morto.");
				System.exit(0);
			}
		} while ((hpB > 0) && (hpA>0));
	}

	public void stampaInfo(IPersonaggio a, IPersonaggio b) {
		System.out.println("" + a.getNomePersonaggio());
		System.out.println("" + a.getHpPersonaggio());
		System.out.println("" + b.getNomePersonaggio());
		System.out.println("" + b.getHpPersonaggio());
	}

}
