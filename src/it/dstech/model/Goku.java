package it.dstech.model;

public class Goku extends Personaggio {

	private final int HP = 800;
	private final int ATTACCO = 50;
	private final int DIFESA = 20;
	private final String NOME = "Goku";
	
	public Goku()
	{
		super.setNomePersonaggio(NOME);
		super.setAttaccoPersonaggio(ATTACCO);
		super.setDifesaPersonaggio(DIFESA);
		super.setHpPersonaggio(HP);
	}
	

}
