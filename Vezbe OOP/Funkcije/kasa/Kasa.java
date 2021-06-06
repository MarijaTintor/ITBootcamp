package funkcije;

import java.util.Scanner;

public class Kasa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcija;
		
		double racun = 0, kupovina = 0, naplata = 0;

		do {
			System.out.println("***KASA***");
			System.out.println("Trenutna cena odabranih proizvoda iznosi: " + racun + " din.");
			System.out.println("Odaberite operaciju:");
			System.out.println("  1) Kupovina novog proizvoda");
			System.out.println("  2) Naplata racuna");
			System.out.println("  0) Zatvaranje kase");
			opcija = sc.nextInt();

			switch (opcija) {
			case 1:
				System.out.println("Unesite cenu novog proizvoda:");
				kupovina = sc.nextDouble();
				while (kupovina <= 0) {
					System.out.println(
							"Nemamo besplatnih proizvoda, niti Vam placamo da uzmete neke od nasih proizvoda.");
					System.out.println("Unesite cenu proizvoda:");
					kupovina = sc.nextInt();
				}
				racun += kupovina;
				break;
			case 2:
				if (racun == 0) {
					System.out.println("Nemamo sta da naplatimo");
				} else {

					System.out.println(
							"Vas racun iznosi " + racun + " din. Molimo unesite koliko novca stavljate u kasu:");
					naplata = sc.nextInt();

					if (naplata == 0) {
						System.out.println("Odlucili ste se da vratite sve proizvode");
						System.out.println("Pokusajte opet.");
						racun = 0;
						break;
					}

					while (naplata < racun && naplata != 0) {
						System.out.println("Vas iznos ne pokriva troskove racuna: " + racun
								+ " din. Molimo Vas ponovo unesite koliko novca dajete:");
						naplata = sc.nextInt();
					}
					System.out.println("Vas kusur iznosi " + (naplata - racun) + " din. Hvala!  Dodjite nam opet! \n");
					racun = 0;
				}
				break;

			case 0:
				if (racun > 0) {
					System.out.println("Vas racun nije naplacen. Morate da platite racun ili vratite sve proizvode");
					opcija = 2;
				} else
					System.out.println("Kasa se gasi. Izlazak iz programa.");
				break;

			default:
				System.out.println("Pogresan unos. Molimo Vas odaberite jednu od ponudjenih operacija.");
				break;
			}
		} while (opcija != 0);
	}
}
