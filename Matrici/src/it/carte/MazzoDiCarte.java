package it.carte;

/**
 * Classe che rappresenta un mazzo di carte da gioco
 * @author hp
 *
 */
public class MazzoDiCarte {

	private Carta[] mazzo = new Carta[52];
	
	int pos = 0;

	private String[] semi = {"Quadri", "Cuori", "Picche", "Fiori"};
	private String[] valori = {"Asso", "Due", "Tre", "Quattro", "Cinque", "Sei", "Sette", "Otto", "Nove", "Dieci", "Fante", "Regina"
			,"Re"};

	public MazzoDiCarte() {
		crea();
	}
	
	/**
	 * Metodo che crea il mazzo di carte
	 */
	public void crea() {
		int count = 0;
		for(int i = 0; i < semi.length; i++)
			for( int j = 0; j < valori.length; j++) {
				mazzo[count] = new Carta(semi[i], valori[j]);
				count++;
			}
	}

	/**
	 * Metodo che scambia la posizione di due carte nel mazzo
	 * @param i posizione della prima carta
	 * @param j posizione della seconda carta
	 */
	public void scambia(int i, int j) {
		Carta x = mazzo[i];
		mazzo[i] = mazzo[j];
		mazzo[j] = x;
	}

	/**
	 * Metodo che mescola le carte del mazzo
	 */
	public void mescola() {
		for (int i = mazzo.length-1 ; i > 0; i--){
			int j = (int)(Math.random()*(i + 1));
			scambia(i, j);
		}
	}

	/**
	 * Metodo che restituisce la prossima carta
	 * @return la prossima carta del mazzo
	 */
	public Carta distribuisci() {
		Carta c = mazzo[pos];
		pos++;
		return c;
	}
}