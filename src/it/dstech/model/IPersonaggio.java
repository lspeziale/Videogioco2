package it.dstech.model;

public interface IPersonaggio {
	
	public String getNomePersonaggio();
	public int getHpPersonaggio();
	public int getAttaccoPersonaggio();
	public int getDifesaPersonaggio();
	public void setHpPersonaggio(int a);
	public void setNomePersonaggio(String a);
	public int mossaUtente(boolean a);
	public int getCombo();
	public void setCombo(int combo);
}
