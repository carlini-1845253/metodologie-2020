package it.pitagora;

/**
 * Classe che rappresenta una tavola pitagorica di dimensioni NxN
 * @author hp
 *
 */
public class TavolaPitagorica {

	private int[][] tavola;

	public TavolaPitagorica(int N) {
		tavola = new int[N][N];
		crea();
	}

	/**
	 * Metodo che assegna i valori alla tavola pitagorica
	 */
	public void crea() {
		for(int i = 0; i < tavola.length; i++)
			for(int j = 0; j < tavola[0].length; j++)
				tavola[i][j] = (i+1)*(j+1);
	}

	/**
	 * Metodo che stampa la tavola
	 */
	public void stampa() {
		for(int i = 0; i < tavola.length; i++)
			for(int j = 0; j < tavola[0].length; j++) {
				System.out.print(tavola[i][j]);
				if(j != tavola[0].length-1)
					System.out.print(", ");
				else
					System.out.println();
			}
	}
	
	/**
	 * Metodo che restituisce un intero della tavola
	 * @param x valore della riga
	 * @param y valore della colonna
	 * @return il valore della tavola in posizione x, y
	 */
	public int getValore(int x, int y) {
		return tavola[x][y];
	}

	public static void main(String[] args) {
		TavolaPitagorica t = new TavolaPitagorica(10);
		t.stampa();
		System.out.println(t.getValore(4, 7));
	}
}