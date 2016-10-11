package it.dstech.model;

public class Vegeta extends Personaggio {

	private final int HP = 1100;
	private final int ATTACCO = 60;
	private final int DIFESA = 20;
	private final String NOME = "Vegeta";
	
	public Vegeta()
	{
		super.setNomePersonaggio(NOME);
		super.setAttaccoPersonaggio(ATTACCO);
		super.setDifesaPersonaggio(DIFESA);
		super.setHpPersonaggio(HP);
	}

}
