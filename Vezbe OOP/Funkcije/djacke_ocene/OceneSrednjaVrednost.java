package funkcije;

import java.util.Scanner;

public class OceneSrednjaVrednost {

	public static void main(String[] args) {
		/*
		 * Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		 * numerickom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar,
		 * dovoljan, nedovoljan)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("***Unesite djacke ocene***");

		double zbir = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.print("Unesi " + i + ". djacku ocenu: ");
			double ocena = sc.nextDouble();
			zbir = ocena + zbir;
		}
		zbir /= 3;

		if (zbir >= 4.5) {
			System.out.println("Prosecna ocena je " + String.format("%.2f", zbir) + ", te je djak odlican.");
		} else if (zbir >= 3.5 && zbir < 4.5) {
			System.out.println("Prosecna ocena je " + String.format("%.2f", zbir) + ", te je djak vrlo dobar.");
		} else if (zbir >= 2.5 && zbir < 3.5) {
			System.out.println("Prosecna ocena je " + String.format("%.2f", zbir) + ", te je djak dobar.");
		} else if (zbir >= 1.5 && zbir < 2.5) {
			System.out.println("Prosecna ocena je " + String.format("%.2f", zbir) + ", te je djak dovoljan.");
		} else {
			System.out.println("Prosecna ocena je " + String.format("%.2f", zbir) + ", te je djak nedovoljan.");
		}
	}
}
