package it.dstech.model;

public interface IPersonaggio {
	public int mossa();
	public String getNomePersonaggio();
	public int getHpPersonaggio();
	public int getAttaccoPersonaggio();
	public int getDifesaPersonaggio();
	public void setHpPersonaggio(int a);
	public void setNomePersonaggio(String a);
	public int mossaUtente();
	public int getCombo();

	public void setCombo(int combo);
}
