package it.riscaldamento;

/**
 * Classe che simula il comportamento di una lista di interi con l'uso di un array
 * @author hp
 *
 */
public class ListaDiInteri {
	
	private int[] numeri;
	
	public ListaDiInteri(int... numeri) {
		this.numeri = numeri;
	}
	
	/**
	 * Metodo che restituisce l'intero in posizione k
	 * @param index indice dell'array
	 * @return il valore in posizione index
	 */
	public int getValue(int index) {
		return numeri[index];
	}
	
	/**
	 * Restituisce l'indice del valore in input
	 * @param value numero da cercare
	 * @return la posizione del valore (-1 se non presente)
	 */
	public int getIndexOf(int value) {
		for(int i = 0; i< numeri.length; i++)
			if(numeri[i] == value)
				return i;
		return -1;
	}
	
	/**
	 * Override del toString di base
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < numeri.length; i++) {
			sb.append(numeri[i]);
			if(i != numeri.length-1)
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
	
	/**
	 * Restituisce la dimensione dell'array
	 * @return la lungezza dell'array
	 */
	public int size() {
		return numeri.length;
	}
	
	/**
	 * Metodo che indica se un valore è contenuto nell'array
	 * @param value valore da cercare
	 * @return un booleano che ne indica la presenza
	 */
	public boolean contains(int value) {
		return getIndexOf(value) != -1;
	}
	
	/**
	 * Metodo che aggiunge in fondo alla lista il valore
	 * @param valore da aggiungere alla lista
	 */
	public void add(int valore) {
		add(valore, size());
	}
	
	/**
	 * Metodo che aggiunge un intero in posizione index
	 * @param valore da aggiungere
	 * @param index posizione in cui aggiungere
	 */
	public void add(int valore, int index) {
		int[] nuovo = new int[size()+1];
		for(int i = 0; i < index; i++)
			nuovo[i] = numeri[i];
		
		nuovo[index] = valore;
		
		for(int i = index; i < size(); i++)
			nuovo[i+1] = numeri[i];
		numeri = nuovo;
	}
	
	/**
	 * Metodo che elimina la prima occorrenza di un numero dalla lista
	 * @param valore da eliminare
	 */
	public void delete(int valore) {
		int[] nuovo = new int[size()-1];
		int pos = getIndexOf(valore);
		for(int i = 0; i < size(); i++)
			if(i < pos)
				nuovo[i] = numeri[i];
			else if(i > pos)
				nuovo[i-1] = numeri[i];
		numeri = nuovo;
	}
	

	/**
	 * Metodo che elimina l'elemnto in posizione index
	 * @param index posizione dell'elemento da eliminare
	 */
	public void deleteByIndex(int index) {
		int[] nuovo = new int[size()-1];
		for(int i = 0; i < size(); i++)
			if(i < index)
				nuovo[i] = numeri[i];
			else if(i > index)
				nuovo[i-1] = numeri[i];
		numeri = nuovo;
	}

	public static void main(String[] args) {
		ListaDiInteri l= new ListaDiInteri(3, 4, 5, 6, 1, 2, 7, 15, 19, 4);
		System.out.println(l.toString());
		
		l.add(12);
		System.out.println(l.toString());
		
		l.add(34, 5);
		System.out.println(l.toString());
		
		l.delete(4);
		System.out.println(l.toString());
		
		l.deleteByIndex(8);
		System.out.println(l.toString());
	}
}