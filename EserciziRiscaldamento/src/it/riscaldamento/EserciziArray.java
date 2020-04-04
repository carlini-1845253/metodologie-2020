package it.riscaldamento;

/**
 * Esercizi di riscaldamento sugli array
 * @author hp
 *
 */
public class EserciziArray {
	
	/**
	 * Metodo che controlla se una parola è contenuta in un array di stringhe
	 * @param parole array di stringhe da controllare
	 * @param parola da cercare
	 * @return un booleano che indica la presenza della parola
	 */
	public boolean isContained(String[] parole, String parola) {
		for(int i = 0; i < parole.length; i++)
			if(parole[i].equals(parola))
				return true;
		return false;
	}
	
	/**
	 * Metodo che restituisce la posizione della parola da cercare in un array di stringhe
	 * @param parole array di stringhe da cercare
	 * @param parola da cercare
	 * @return la posizione della stringa (-1 se non c'è)
	 */
	public int getIndexOf(String[] parole, String parola) {
		for(int i = 0; i < parole.length; i++)
			if(parole[i].equals(parola))
				return i;
		return -1;
	}
	
	/**
	 * Metodo che dato un array di double ne restituisce il massimo
	 * @param numeri array di double
	 * @return il valore massimo dell'array
	 */
	public double getMax(double[] numeri) {
		double max = numeri[0];
		for(int i = 1; i < numeri.length; i++)
			if(numeri[i] > max)
				max = numeri[i];
		return max;
	}

	public static void main(String[] args) {
		EserciziArray es= new EserciziArray();
		System.out.println(es.isContained(new String[] {"ciao", "bella", "hello", "buongiorno"}, "buondi"));
		System.out.println(es.getIndexOf(new String[] {"ciao", "bella", "hello", "buongiorno"}, "buondi"));
		System.out.println(es.getMax(new double[] { 3.5, 7.9, 8.9, 124.5, 12.5}));
	}
}