package it.carte;

public class Carta {
	
	private String seme;
	private String valore;

	public Carta(String seme, String valore) {
		this.seme = seme;
		this.valore = valore;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}
	
	@Override
	public String toString() {
		return getValore()+" di "+getSeme();
	}
}