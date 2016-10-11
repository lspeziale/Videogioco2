package it.dstech.model;

import java.util.Random;
import java.util.Scanner;

public abstract class Personaggio implements IPersonaggio {
	protected int hpPersonaggio;
	protected String nomePersonaggio;
	protected int attaccoPersonaggio;
	protected int difesaPersonaggio;
	int combo = 0;

	public int mossaUtente() {
		int danno = 0;
		boolean flag = false;
		do {
			if (getCombo() >= 4) {
				System.out.println("Hai a disposizione \n 1:pugno 2:Calcio 3:Mossa speciale");
			}
			else if (getCombo() >= 2) {
				System.out.println("Hai a disposizione \n 1:pugno 2:Calcio ");
			}
			else if(getCombo()<2){
				System.out.println("Hai a disposizione \n 1:Pugno ");
			}
			Scanner sc = new Scanner(System.in);

			int i = sc.nextInt();
			switch (i) {
			case 1:
				danno = pugno();
				setCombo(getCombo() + 1);
				flag = true;
				break;
			case 2:
				if (getCombo() >= 2) {
					danno = calcio();
					setCombo(getCombo() - 2);
					flag = true;
				}
				break;
			case 3:
				if (getCombo() >= 4) {
					danno = attaccoSpeciale();
					setCombo(getCombo() - 4);
					flag = true;
				}

				break;
			default:
				System.out.println("ERRORE");

			}
		} while (flag == false);
		return danno;
	}

	public int mossa() {
		int danno = 0;
		int x = (int) (Math.random() * 100);
		if (x < 80) {
			danno = pugno();

		} else if (x >= 80 && x < 95) {
			danno = calcio();

		} else if (x >= 95 && x <= 100) {
			danno = attaccoSpeciale();

		}

		return danno;
	}

	public int random(int a, int b) {
		Random rnd = new Random();
		int aggiunta = rnd.nextInt(b - a) + a;
		return aggiunta;
	}

	public int pugno() {
		int danno = getAttaccoPersonaggio() + random(1, 10);

		System.out.println("-------------------------------");
		System.out.print("Con il pugno ");
		return danno;
	}

	public int calcio() {
		int danno = getAttaccoPersonaggio() + random(10, 30);

		System.out.println("-------------------------------");
		System.out.print("Con il calcio");
		return danno;
	}

	public int attaccoSpeciale() {
		int danno = getAttaccoPersonaggio() + random(30, 60);

		System.out.println("-------------------------------");
		System.out.print("Con la mossa speciale");
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

	public int getCombo() {
		return combo;
	}

	public void setCombo(int combo) {
		this.combo = combo;
	}
}