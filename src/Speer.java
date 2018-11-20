import java.util.Random;

public class Speer extends Waffe {
	private int anzahlAngriffe = 2;
	private boolean Art = false;
	
	public int getRandomAngriffspunkte() {
		// zwischen 1-7
		Random rnd = new Random();

		return rnd.nextInt(7 - 1 + 1) + 1;
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
