import java.util.Random;

public class Keule extends Waffe {

	public int anzahlAngriffe = 1;
	boolean Art = true;
	
	public int getRandomAngriffspunkte() {
		// zwischen 5 -15
		Random rnd = new Random();

		return rnd.nextInt(15 - 5 + 1) + 5;
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
