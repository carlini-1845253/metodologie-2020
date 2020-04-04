package it.riscaldamento;

public class FrasePalindroma {

	public boolean isPalindroma(String frase) {
		for(int i = 0, j = frase.length()-1; i != j; i++, j--)
			if(frase.charAt(i) != frase.charAt(j))
				return false;
		return true;
	}
}