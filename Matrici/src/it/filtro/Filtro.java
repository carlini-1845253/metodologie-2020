package it.filtro;

/**
 * Classe che permette di ottenere nuovi sotto-array di quello iniziale
 * @author hp
 *
 */
public class Filtro {
	
	private int[] array;
	
	public Filtro(int... array) {
		this.array = array;
	}
	
	/**
	 * Restituisce un array con tutti gli elementi minori o uguali di un intero k
	 * @param k valore da confrontare
	 * @return un array di interi
	 */
	public int[] passaBasso(int k) {
		int count = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i] <= k)
				count++;
		
		int[] nuovo = new int[count];
		count = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i] <= k) {
				nuovo[count] = array[i];
				count++;
			}
		
		return nuovo;
	} 

	/**
	 * Metodo che restituisce un array con interi tutti superiori a k
	 * @param k valore da confrontare
	 * @return un array di interi
	 */
	public int[] passaAlto(int k) {
		int count = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i] >= k)
				count++;
		
		int[] nuovo = new int[count];
		count = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i] >= k) {
				nuovo[count] = array[i];
				count++;
			}
		
		return nuovo;
	}
	
	/**
	 * Metodo che elimina dall'array iniziale tutte le occorrenze di k
	 * @param k valore da eliminare
	 * @return l'array iniziale modificato
	 */
	public int[] filtra(int k) {
		// conto le volte in cui compare k
		int count = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i] == k)
				count++;
		
		int[] nuovo = new int[array.length-count];
		count = 0;
		
		for(int i = 0; i < array.length; i++)
			if(array[i] != k) {
				nuovo[count] = array[i];
				count++;
			}
				
		array = nuovo;
		return array;
	}
	
	/**
	 * Metodo che elimina tutti gli elementi dell'array passato
	 * @param array contenete gli elemnti da eliminare
	 * @return array iniziale modificato
	 */
	public int[] filtra(int[] array2) {
		for(int k : array2)
			array = filtra(k);
		
		return array;
	}
	
	/**
	 * Metodo che restituisce la versione a stringa di un array di interi
	 * @param vettore da trasformare
	 * @return il vettore sotto forma di stringa
	 */
	public String toString(int[] vettore) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < vettore.length; i++) {
			sb.append(vettore[i]);
			if(i != vettore.length-1)
				sb.append(", ");
			else
				sb.append("]");
		}
			
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Filtro f = new Filtro(1, 2, 10, 2, 42, 7, 8);
		System.out.println(f.toString(f.passaBasso(8)));
		System.out.println(f.toString(f.passaAlto(9)));
		System.out.println(f.toString(f.filtra(2)));
		System.out.println(f.toString(f.filtra(new int[] {2, 7, 42})));
	}
}