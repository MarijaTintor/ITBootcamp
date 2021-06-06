package funkcije;

import java.util.Scanner;

public class TablaSkakac {

	public static void main(String[] args) {
		/*
		 * Na sahovskoj tabli je red obelezen sa 1 2 3 4 5 6 7 8 i kolona sa 1 2 3 4 5 6
		 * 7 8. Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni
		 * skakac sa vrha. Korisnik prvo unosi pozicije piona kao dva cela broja, a
		 * zatim poziciju skakaca, gde prvi broj predstavlja red, a drugi kolonu.
		 * Program treba da ispise da li se figure nalaze u poziciji da je skakac
		 * napadnut. Primeri: 6 4 7 4 ---> nije napadnut 6 4 5 5 ---> jeste napadnut 2 2
		 * 1 1 ---> jeste napadnut 9 1 6 8 ---> greska u unosu
		 */
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
		
			if( (rp < 1 || rp > 8) || (kp < 1 || kp > 8) || (rs < 1 || rs > 8) || (ks < 1 || ks > 8) ) {
				System.out.println("Greska u unosu!");
			} else {
				if( rs == rp - 1 && (ks == kp - 1 || ks == kp + 1) ) {
					System.out.println("Skakac jeste napadnut.");
				} else {
					System.out.println("Skakac nije napadnut.");
				}
			}
	}

}
