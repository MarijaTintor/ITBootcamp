package funkcije;

import java.util.Scanner;

public class NizProizvodElemenata {
	
	public static int [] unosNiza(int [] nizic) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < nizic.length; i++) {
			System.out.print("Unesi " + (i + 1) + ". element niza: ");
			nizic[i] = sc.nextInt();
		}
		return nizic;
	}
	
	public static void ispisNiza(int [] nizic) {
		int rezultat = 1;
		for(int i = 0; i < nizic.length; i++) {
			if(i< nizic[i]) {
				rezultat *= nizic[i];
			}
		}System.out.print("Proizvod elemenata niza koji su veci od njihovih indeksa je " + rezultat + ".");
	}

	public static void main(String[] args) {
		/* Napisati program koji izracunava proizvod elemenata niza tipa int, koji su
		 * veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno
		 * metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza. Primer
		 * ucitanog niza: 3 7 1 4 2 5 Primer izracunatog proizvoda: 84
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi duzinu niza: ");
		int duzina = sc.nextInt();
		int [] niz = new int [duzina];
		
		
		unosNiza(niz);
		ispisNiza(niz);
	}

}
