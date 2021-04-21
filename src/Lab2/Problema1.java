package Lab2;

public class Problema1 {

	public static int viteza(String s) {
		if (s.compareToIgnoreCase("Oras") == 0)
			return 50;
		else if (s.compareToIgnoreCase("Zona Rezidentiala") == 0)
			return 30;
		else if (s.compareToIgnoreCase("Drum Express") == 0)
			return 100;
		else if (s.compareToIgnoreCase("Autostrada") == 0)
			return 130;
		else
			return 0;

	}

	public static int viteza2(String s) {

		if (s.compareToIgnoreCase("Oras") == 0) {
			return 50;
		} else {
			if (s.compareToIgnoreCase("Zona rezidentiala") == 0) {
				return 30;
			} else {
				if (s.compareToIgnoreCase("Drum express") == 0) {
					return 100;
				} else {
					if (s.compareToIgnoreCase("Autostrada") == 0) {
						return 130;
					} else {
						return 0;
					}
				}
			}
		}

	}

	public static int viteza3(String s) {

		switch (s) {

		case "Oras":
			return 50;
		case "Zona rezidentiala":
			return 30;
		case "Drum express":
			return 100;
		case "Autostrada":
			return 130;
		default:
			return 0;
		}

	}

	public static void main(String args[]) {

		System.out.println("Varianta if-else");
		System.out.println("Oras-" + viteza("Oras"));
		System.out.println("Zona Rezidentiala-" + viteza("Zona rezidentiala"));
		System.out.println("Drum express-" + viteza("Drum express"));
		System.out.println("Autostrada-" + viteza("Autostrada"));
		System.out.println("Necunoscut-" + viteza("necunoscut"));
		System.out.println();

		System.out.println("Varianta if(){} - else {}");
		System.out.println("Oras-" + viteza2("Oras"));
		System.out.println("Zona Rezidentiala-" + viteza2("Zona rezidentiala"));
		System.out.println("Drum express-" + viteza2("Drum express"));
		System.out.println("Autostrada-" + viteza2("Autostrada"));
		System.out.println("Necunoscut-" + viteza2("necunoscut"));
		System.out.println();

		System.out.println("Varianta Switch");
		System.out.println("Oras-" + viteza3("Oras"));
		System.out.println("Zona Rezidentiala-" + viteza3("Zona rezidentiala"));
		System.out.println("Drum express-" + viteza3("Drum express"));
		System.out.println("Autostrada-" + viteza3("Autostrada"));
		System.out.println("Necunoscut-" + viteza3("necunoscut"));
		System.out.println();
	}

}
