package funkcije;

import java.util.Scanner;

public class SortiranjeStringova {

	public static String[] unosStringova(String[] nizic) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nizic.length; i++) {
			System.out.print("Unesi " + (i + 1) + ". rec niza: ");
			nizic[i] = sc.next();
		}
		return nizic;
	}
	
	public static int proveraStringova(String[] nizic) {
		for (int i = 0; i < nizic.length; i++) {
			if (nizic[i].equals(nizic[i].toUpperCase())) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		/*
		 * Napisati funkciju koja prima niz stringova. Funkcija vraca indeks prvog
		 * elementa koji je napisan svim velikim slovima. Ako ni jedan element niza nije
		 * ispisan svim velikim slovima vraca -1.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi duzinu niza: ");
		int duzina = sc.nextInt();
		String [] niz = new String [duzina];
		
		unosStringova(niz);
		System.out.println(proveraStringova(niz));

	}
}
