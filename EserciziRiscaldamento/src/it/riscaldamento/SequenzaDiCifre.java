package it.riscaldamento;

/**
 * Classe che rappresenta un array di cifre
 * @author hp
 *
 */
public class SequenzaDiCifre {
	
	private int[] cifre = new int[0];
	
	/**
	 * Metodo che inserisce le prime N cifre contenute in una stringa all'interno di una array
	 * @param s stringa da analizzare
	 * @param N le prime n cifre da inserire
	 */
	public void aggiungiCifre(String s, int N) {
		int[] nuovo = new int[N];
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				nuovo[count] = Character.getNumericValue(s.charAt(i));
				count++;
			}
			if(count == N) break;
		}
		
		int[] appoggio = new int[cifre.length+nuovo.length];
		
		for(int i = 0; i < cifre.length; i++)
			appoggio[i] = cifre[i];
			
		for(int i = cifre.length; i < appoggio.length; i++)
			appoggio[i] = nuovo[i-cifre.length];
		
		cifre = appoggio;
	}
	
	/**
	 * Restituisce la versione a stringa dell'array
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < cifre.length; i++) {
			sb.append(cifre[i]);
			if(i == cifre.length-1)
				sb.append("]");
			else
				sb.append(", ");
		}
		return sb.toString();
	}

	
	public static void main(String[] args) {
		SequenzaDiCifre s = new SequenzaDiCifre();
		s.aggiungiCifre("abejore4man65", 2);
		s.aggiungiCifre("xx---1.0,349aacc", 4);
		System.out.println(s.toString());
	}
}