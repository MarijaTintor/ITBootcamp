package funkcije;

import java.util.Scanner;

public class NizZbirParnihIndeksa {
	
	public static void unosBrojeva( int [] nizic) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < nizic.length; i++) {
			System.out.println("Unesi " + (i + 1 ) + ". broj niza.");
			nizic[i] = sc.nextInt();
		}
		
	}
	
	public static int zbirBrojeva( int [] nizic) {
		int zbir = 0;
		for(int i = 0; i < nizic.length; i++) {
			if(i%2==0) {
				zbir+=nizic[i];
			}
		}return zbir;
	}
	
	public static void main(String[] args) {
		/*
		 * Napisati program koji pomocu jedne funkcije ucitava niz. Nakon toga pomocu
		 * druge funkcije izracunava zbir svih brojeva koji se nalaze na parnim
		 * pozicijama (0, 2, 4 itd.). Iz glavnog programa se na standardni izlaz
		 * ispisuje rezultat.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi velicinu niza: ");
		int duz = sc.nextInt();
		int [] niz = new int [duz];
		
		unosBrojeva(niz);
		int rez = zbirBrojeva(niz);
		System.out.println("Zbir brojeva na parnim indeksima je " + rez);

	}

}
