package it.dstech.model;

public class VideogiocoMain {
	public static final boolean UTENTE= true;
	public static final boolean COMPUTER= false;
	
	public static void main(String args[])
	{
		SceltaPersonaggio scelta = new SceltaPersonaggio();
		IPersonaggio pg1 = scelta.scelta(UTENTE);
		IPersonaggio pg2 = scelta.scelta(COMPUTER);
		CombatManager comb = new CombatManager();
		comb.stampaInfo(pg1, pg2);
		comb.combatti(pg1, pg2);
		comb.stampaInfo(pg1, pg2);
	}
}
