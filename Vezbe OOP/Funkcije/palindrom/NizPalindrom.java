package funkcije;
import java.util.Scanner;

public class NizPalindrom {
	
	public static boolean funkcijaPalindrom(int [] nizic) {
		for(int i = 0; i < nizic.length; i++) {
			if( nizic[i] == nizic[(nizic.length-i-1)]) {
				
			}else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji
		 * su tipa int. 
		 * 
		 * Zatim niz proslediti metodi koja treba da proveri da li je niz
		 * palindrom ili nije. Na standradnom izlazu obavestiti krajnjeg korisnika njemu
		 * razumljivim tekstom da li je unesen niz palindrom. Primer ucitanog niza koji
		 * je palindrom: 12 46 17 46 12 Primer ucitanog niza koji nije palindrom: 12 46
		 * 17 12 64
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi duzinu niza brojeva: ");
		int duzina = sc.nextInt();
		int [] niz = new int [duzina];
		
		for(int i = 0; i < niz.length; i ++){
			System.out.print("Unesi " + (i + 1) + ". broj niza: ");
			niz [i] = sc.nextInt();
		}
		
		Boolean palindrom = funkcijaPalindrom(niz);
		
		if (palindrom) {
			System.out.println("Niz je palindrom!");
		}else {
			System.out.println("Niz nije palindrom!");
		}

	}

}
