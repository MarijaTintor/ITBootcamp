package funkcije;

import java.util.Scanner;

public class TablaPion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi kordinate piona.");
		System.out.print("Red je: ");
		int rp = sc.nextInt();
		System.out.print("Kolona je: ");
		int kp = sc.nextInt();

		System.out.println("Unesi kordinate skakaca.");
		System.out.print("Red je: ");
		int rs = sc.nextInt();
		System.out.print("Kolona je: ");
		int ks = sc.nextInt();

		if ((rp < 1 || rp > 8) || (kp < 1 || kp > 8) || (rs < 1 || rs > 8) || (ks < 1 || ks > 8)) {
			System.out.println("Greska u unosu!");
		} else {
			if ((kp == ks + 1 && rp == rs - 2) || (kp == ks - 1 && rp == rs - 2) || (kp == ks + 2 && rp == rs - 1)
					|| (kp == ks - 2 && rp == rs - 1) || (kp == ks + 2 && rp == rs + 1)
					|| (kp == ks + 2 && rp == rs + 1) || (kp == ks + 1 && rp == rs + 2)
					|| (kp == ks - 1 && rp == rs + 2)) {
				System.out.println("Pion jeste napadnut.");
			} else {
				System.out.println("Pion nije napadnut.");
			}
		}
	}

}
