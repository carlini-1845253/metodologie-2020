package it.riscaldamento;

public class Riscaldamento {
	
	/**
	 * Stampa una matrice di 0 e 1 di dimensioni n x n
	 * @param n dimensione della matrice
	 */
	public void printMatrix(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((j % i == 0)||(i % j == 0))
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();	
		}
	}
	
	/**
	 * Metodo che conta le occorrenze di una parola in una testo
	 * @param testo da analizzare
	 * @param parola da cercare
	 * @return il numero di volte in cui la parola è presente nel testo
	 */
	public int conta(String testo, String parola) {
		int count = 0;
		String[] parole = testo.split(" ");
		for(int i=0; i<parole.length; i++)
			if(parole[i].equals(parola))
				count++;
		return count;
	}
	
	/**
	 * Metodo che stampa tutti i divisori propri di n
	 * @param n numero da analizzare
	 */
	public void stampaDivisori(int n) {
		for(int i = 2; i < n; i++)
			if(n % i == 0) {
				System.out.print(i);
				if(i != n-1)
					System.out.print(", ");
			}
	}
	
	/**
	 * Metodo che esegue stampa i prossimi N numeri dove ognuno di essi 
	 * è la somma dei due che lo precedono
	 * @param a primo numero
	 * @param b secondo numero
	 * @param N numero di numeri da calcolare
	 */
	public void sommaNumeriPrecedenti(int a, int b, int N) {
		System.out.print(a+", "+b+", ");
		for(int i = 0; i < N; i++) {
			int var = a + b;
			a = b;
			b = var;
			System.out.print(var);
			if(i != N-1)
				System.out.print(", ");
			
		}
	}
	
	/**
	 * Metodo che stampa una cornice di asterischi di dimensione N x N
	 * @param N dimensione della cornice
	 */
	public void stampaCornice(int N) {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if((i == 0) || (i == N-1) || ( j==0 ) ||(j == N-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Metodo che restituisce una stringa di parole, dove ogni parola è una cifra a lettera del numero N
	 * @param N numero da analizzare
	 * @return la stringa corrispondente
	 */
	public String daCifreALettere(int N) {
		String numero = ""+N;
		String res = "";
		for(int i = 0; i < numero.length(); i++) {
			switch(numero.charAt(i))
			{
				case '0': res += "zero "; break;
				case '1': res += "uno "; break;
				case '2': res += "due "; break;
				case '3': res += "tre "; break;
				case '4': res += "quattro "; break;
				case '5': res += "cinque "; break;
				case '6': res += "sei "; break;
				case '7': res += "sette "; break;
				case '8': res += "otto "; break;
				case '9': res += "nove "; break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Riscaldamento r = new Riscaldamento();
		//r.printMatrix(10);
		System.out.println(r.conta("Questo testo non ha alcun senso altrimenti non sarebbe un testo", "testo"));
		//r.stampaDivisori(20);
		//r.sommaNumeriPrecedenti(2, 3, 6);
		//r.stampaCornice(6);
		System.out.println(r.daCifreALettere(8452));
	}
}