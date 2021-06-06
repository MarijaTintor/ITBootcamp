package funkcije;

import java.util.Scanner;

class Teniseri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int izbor;

		do {
			System.out.println("Kviz za pogadjanje tenisera.");
			System.out.println("1.Djokovic");
			System.out.println("2.Nadal");
			System.out.println("3.Federer");
			System.out.println("4.Izlaz");

			izbor = sc.nextInt();

			switch (izbor) {
				case 1:
					System.out.println("Iz koje zemlje dolazi Djokovic?");
					String Djokovic = sc.next();
					if( Djokovic.equals("Srbija")) {
						System.out.println("Tacan odgovor!");
					} else {
						System.out.println("Odgovor nije tacan!");
						izbor = 1;
					}
					
					break;
				case 2:
					System.out.println("Iz koje zemlje dolazi Nadal?");
					String Nadal = sc.next();
					if( Nadal.equals("Spanija")) {
						System.out.println("Tacan odgovor!");
					} else {
						System.out.println("Odgovor nije tacan!");
						izbor = 2;
					}
					break;
				case 3:
					System.out.println("Iz koje zemlje dolazi Federer?");
					String Federer = sc.next();
					if( Federer.equals("Svajcarska")) {
						System.out.println("Tacan odgovor!");
					} else {
						System.out.println("Odgovor nije tacan!");
						izbor = 3;
					}
					break;
			
			} 
			
		} while (izbor != 4);
		System.out.println("Dovidjenja!");

	}

}
