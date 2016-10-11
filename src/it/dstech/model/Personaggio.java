package it.dstech.model;

public abstract class Personaggio implements IPersonaggio {
	protected int hpPersonaggio;
	protected String nomePersonaggio;
	protected int attaccoPersonaggio;
	protected int difesaPersonaggio;

	public int mossa()
	{
		int aggiunta = (int)(Math.random()*20);
		int danno = attaccoPersonaggio + aggiunta;
		return danno;
	}

	
	
	public int getHpPersonaggio() {
		return hpPersonaggio;
	}



	public void setHpPersonaggio(int hpPersonaggio) {
		this.hpPersonaggio = hpPersonaggio;
	}



	public String getNomePersonaggio() {
		return nomePersonaggio;
	}



	public void setNomePersonaggio(String nomePersonaggio) {
		this.nomePersonaggio = nomePersonaggio;
	}



	public int getAttaccoPersonaggio() {
		return attaccoPersonaggio;
	}



	public void setAttaccoPersonaggio(int attaccoPersonaggio) {
		this.attaccoPersonaggio = attaccoPersonaggio;
	}



	public int getDifesaPersonaggio() {
		return difesaPersonaggio;
	}



	public void setDifesaPersonaggio(int difesaPersonaggio) {
		this.difesaPersonaggio = difesaPersonaggio;
	}
}