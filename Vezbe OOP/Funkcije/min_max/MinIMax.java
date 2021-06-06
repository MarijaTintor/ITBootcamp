package funkcije;

import java.util.Scanner;

public class MinIMax {
	
	public static int max(int [] niz) {
		int max = niz[0];
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] > max) {
				max = niz[i];
			}
		} 
		return max;
	}
	
	public static int min(int [] niz) {
		int min = niz[0];
		for(int j = 0; j < niz.length; j++) {
			if(niz[j] <= min) {
				min = niz[j];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		/*
		 * Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i
		 * minimalni broj.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi velicinu niza brojeva: ");
		int duzina = sc.nextInt();
		int [] niz = new int [duzina];
		
		for(int i = 0; i < niz.length; i++) {
			System.out.print("Unesi " + (i+1) + ". element: ");
			niz [i] = sc.nextInt();
		}
		
		
		System.out.println("Najveci broj je " + max(niz));
		System.out.println("Najmanji broj je " + min(niz));
		
	}
}
