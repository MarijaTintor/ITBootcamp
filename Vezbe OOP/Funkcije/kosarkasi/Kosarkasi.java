package funkcije;

import java.util.Scanner;
import java.util.Arrays;

public class Kosarkasi {
	
	public static Double [] vratiNiz (Double [] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < 5 ; i++) {
				System.out.print("Visina " + (i+1) + ". igraca je: ");
				niz [i] = sc.nextDouble();
		}
		sc.close();
		return niz;
	}
	
	public static Double funkcijaMax(Double [] niz) {
		double max = 0;
		for( int i = 0; i < niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
			}
		}
		return max;
	}
	
	public static Double funkcijaMin(Double [] niz) {
		double min = niz[0];
		for( int i = 0; i < niz.length; i++) {
			if (niz[i] < niz [0]) {
				min = niz[i];
			}
		}
		return min;
	}
	
	public static Double funkcijaProsek(Double [] niz) {
		double zbir = 0;
		for(int i = 0; i < niz.length; i++) {
			zbir = zbir + niz [i]; 
		}
		return zbir;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Unesi visine pet igraca kosarkaskog tima: ");
		Double [] niz = new Double [5];
        
		vratiNiz(niz);
		
		System.out.println("Najvisi kosarkas u timu ima visinu " + funkcijaMax(niz));
		System.out.println("Najvisi kosarkas u timu ima visinu " + funkcijaMin(niz));
		System.out.println("Prosecna visina kosarkasa u timu je " + (funkcijaProsek(niz)/5));
		
		
	}

}
