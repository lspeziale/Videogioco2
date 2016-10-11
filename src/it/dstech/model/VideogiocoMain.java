package it.dstech.model;

public class VideogiocoMain {
	public static final boolean UTENTE= true; //statico in quanto senno' non potremmo vederle nel main 
	public static final boolean COMPUTER= false;
	
	public static void main(String args[])
	{
		SceltaPersonaggio scelta = new SceltaPersonaggio();
		IPersonaggio pg1 = scelta.scelta(UTENTE);
		IPersonaggio pg2 = scelta.scelta(COMPUTER);
		CombatManager comb = new CombatManager();
		comb.stampaInfoIniziale(pg1, pg2);
		comb.combatti(pg1, pg2);
		comb.stampaInfoFinale(pg1, pg2);
	}
}
