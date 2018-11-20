
import java.util.Scanner;

public class Spiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		System.out.println("Die Waffe sind Keule(k) und Speer(s)");

		System.out.println("Enter name spieler 1:");

		String name = scr.nextLine().toString();
		Spieler krieger1 = null;
		Spieler krieger2 = null;
		
		if (scr.nextLine().toString().equals("k")) {
			Waffe w1 = new Keule();
			krieger1 = new Spieler(name, w1, 50);
		} else {
			Waffe w2 = new Speer();
			krieger2 = new Spieler(name, w2, 50);
		}

		System.out.println("Enter name spieler 2:");
		name = scr.nextLine().toString();
		if (scr.nextLine().toString().equals("s")) {
			Waffe w2 = new Speer();
			krieger2 = new Spieler(name, w2, 50);
		} else {

			Waffe w1 = new Keule();
			krieger1 = new Spieler(name, w1, 50);
		}
//		scr.hasNextLine();
//		String temp = scr.next();
//		Spieler krieger1 = new Spieler(temp, 50);
//		temp = scr.next();
//		Spieler krieger2 = new Spieler(temp, 50);

		System.out.println("---------beginnen----------");

		boolean exit = true;

		while (scr.hasNext() && exit) {
			String str1 = scr.next();
			if (krieger1.getName().equals(str1)) {
				String str2 = scr.next();

				if (str2.equals("heilen")) {
					krieger1.heilen();
				} else if (krieger2.getName().equals(str2)) {
					exit = krieger1.fight(krieger2);
				} else {
					System.out.println("1- Eingabe ist flash!");
				}

			} else if (krieger2.getName().equals(str1)) {
				String str2 = scr.next();

				if (str2.equals("heilen")) {
					krieger2.heilen();
				} else if (krieger1.getName().equals(str2)) {
					exit = krieger2.fight(krieger1);
				} else {
					System.out.println("2- Eingabe ist flash!");
				}

			} else {
				System.out.println("3- Eingabe ist flash!");
			}
		}

		System.out.println("\n ******************\\ fertig //******************");
	}
}
