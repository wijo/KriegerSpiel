import java.awt.geom.GeneralPath;
import java.util.Random;

public class Spieler {
	private String nameSpieler;
	private int lebenspunkte;
	private Waffe waffe;
	private int atk = 1;
	private boolean atkStatus = true;

	public Spieler(String strnam, Waffe wa, int lpunkt) {
		this.nameSpieler = strnam;
		this.lebenspunkte = lpunkt;
		this.waffe = wa;
	}

	
	public boolean fight(Spieler spieler) {
		if (atkStatus) {
			Random randNumber = new Random();
			//int damage = randNumber.nextInt(14) + 1;
			int damage = this.waffe.getRandomAngriffspunkte();

			
			if (waffe.isArt()) {
				atkStatus = false;
				spieler.atkStatus = false;
				spieler.waffe.setAnzahlAngriffe(2);
			}
			if (this.waffe.isArt() == false && this.waffe.getAnzahlAngriffe() <= 2 && this.waffe.getAnzahlAngriffe() > 1) {
				this.waffe.setAnzahlAngriffe(this.waffe.getAnzahlAngriffe() -1);
			} else {
				spieler.atkStatus = true;
				atkStatus = false;
			}

			spieler.lebenspunkte -= damage;

			System.out.println(getName() + " grieft " + spieler.getName() + " Mit " + damage + " an");
			System.out.println("nun hat " + spieler.getName() + " noch " + spieler.getLebenspunkte() + " Lebenspunkte");

			if (spieler.lebenspunkte <= 0) {
				System.out.println(spieler.getName() + " hat verloren");
				return false;
			}

			/*
			 * if(damage == randNumber.nextInt(15)) {
			 * System.out.println("**Geschenck** für "+getName() + " Ihre Lebenspunkte + "+
			 * damage); lebenspunkte += damage; }
			 */
			
			return true;
		} else {
			System.out.println(getName() + " ist nicht daran!");
			return true;
		}

	}

	public void heilen() {
		Random randNumber = new Random();
		int lp = randNumber.nextInt((10 - 5) + 1) + 5;
		lebenspunkte += lp;
		System.out.println("lebenspunkte + " + lp);
	}

	public String getName() {
		return nameSpieler;
	}

	public int getLebenspunkte() {
		if (lebenspunkte > 0)
			return lebenspunkte;
		else {
			lebenspunkte = 0;
			return 0;
		}
	}
}
