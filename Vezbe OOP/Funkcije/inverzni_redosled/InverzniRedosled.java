package funkcije;

import java.util.Scanner;
import java.util.Arrays;


public class InverzniRedosled {

	public static void ispisNiza(int [] nizic) {
		for (int j = (nizic.length - 1); j >= 0; j--) {
			System.out.print(nizic[j] + " ");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi duzinu niza: ");
		int duzina = sc.nextInt();
		int[] niz = new int[duzina];

		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesi " + (i + 1) + ". element niza: ");
			niz[i] = sc.nextInt();
		}
		System.out.println("Redosled unetih elemenata je: " + Arrays.toString(niz));
		
		System.out.print("Obrnuti redosled niza je: ");
		ispisNiza(niz);
		
	}
}
