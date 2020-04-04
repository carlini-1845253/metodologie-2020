package it.riscaldamento;

public class ConvertitoreDiBase {
	
	private int numero;
	
	public ConvertitoreDiBase(int numero) {
		this.numero = numero;
	}
	
	public ConvertitoreDiBase(String numero) {
		this(Integer.parseInt(numero));
	}
	
	public String converti(int numero, int base) {
		String result = "";
		while(numero > 0) {
			result += numero % base;
			numero = numero/ base;
		}
		return inverti(result);
	}
	
	/**
	 * Metodo che inverte una stringa
	 * @param numero stringa da invertire
	 * @return la stringa invertita
	 */
	private String inverti(String numero) {
		String res = "";
		for(int i = numero.length()-1; i >= 0; i--)
			res += numero.charAt(i);
		numero = res;
		return numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {
		ConvertitoreDiBase cb = new ConvertitoreDiBase(12);
		System.out.println(cb.converti(cb.getNumero(), 2));
	}
}