
public class Waffe {
	
	private int anzahlAngriffe;
	private boolean Art;
	
	public Waffe() {
		
	}

	public int getRandomAngriffspunkte() {
		return 1;

	}

	public int getAnzahlAngriffe() {
		return anzahlAngriffe;
	}

	public void setAnzahlAngriffe(int anzahlAngriffe) {
		this.anzahlAngriffe = anzahlAngriffe;
	}

	public boolean isArt() {
		return Art;
	}

	public void setArt(boolean art) {
		Art = art;
	}
	
}
