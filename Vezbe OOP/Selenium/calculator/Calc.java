package domaciTestNG;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {

		// Ovaj kod predstavlja kalkulator povrsina
		// kvadrata, pravougaonika i kruga.
		// Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
		// Ukoliko se unese 'izadji', program treba da se zavrsi.
		// Program treba da se ponavlja dokle god se ne unese izadji.

		Scanner sc = new Scanner(System.in);

		System.out.println("***Unesi ime figure***");
		System.out.println("1. Kvadrat");
		System.out.println("2. Pravougaonik");
		System.out.println("3. Krug");
		System.out.println("3. Izadji");

		String figura;
		String figura1;

		while (true) {
			figura1 = sc.nextLine();
			figura = figura1.toLowerCase();
			switch (figura) {
			case "kvadrat":
				racunajKvadrat();
				break;
			case "pravougaonik":
				racunajPravougaonik();
				break;
			case "krug":
				racunajKrug();
				break;
			case "izadji":
				return;
			}
		}
	}

	public static void racunajKrug() {
		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();
		System.out.print("Unesi poluprecnik kruga: ");
		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kruga je " + pKruga(r));
	}

	public static void racunajPravougaonik() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Unesi a stranicu pravougaonika: ");
		a = sc.nextDouble();
		System.out.println("Unesi b stranicu pravougaonika: ");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina pravougaionika je " + pPravougaonika(a, b));

	}

	public static void racunajKvadrat() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.print("Unesi stranicu kvadrata: ");
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kvadrata je " + pKvadrata(a));

	}

	public static double pKruga(double r) {
		return r * r * 3.14;
	}

	public static double pKvadrata(double a) {
		return a * a;
	}

	public static double pPravougaonika(double a, double b) {
		return a * b;
	}
}
