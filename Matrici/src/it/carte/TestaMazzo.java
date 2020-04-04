package it.carte;

public class TestaMazzo {

	public static void main(String[] args) {
		MazzoDiCarte m = new MazzoDiCarte();
		m.mescola();
		for(int i = 0; i < 52; i++)
			System.out.println(m.distribuisci());
	}
}