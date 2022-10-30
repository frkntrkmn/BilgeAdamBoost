package odev1_GezegenKütle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		float gezegen;
		
		while (true) {
			System.out.println("---Hosgeldiniz---");
			System.out.println("kütle giriniz(Kg cinsinden): ");
			float kütle = src.nextFloat();
			System.out.println("Lütfen birini seciniz \n" + "1_gezegen seçmek için: \n" + "2_bütün gezegenler için: ");
			int secim = src.nextInt();

			float agırlıkMerkür = kütle * 3.7f;
			float agırlıkVenüs = kütle * 8.87f;
			float agırlıkDünya = kütle * 9.8f;
			float agırlıkMars = kütle * 3.7f;
			float agırlıkJupiter = kütle * 25.8f;
			float agırlıkSatürn = kütle * 10.44f;
			float agırlıkUranüs = kütle * 8.69f;
			float agırlıkneptün = kütle * 11.15f;

			if (secim == 1) {
				System.out.println("lütfen bir gezegen seçiniz\n" + "1_merkür\n" + "2_venüs\n" + "3_dünya\n"
						+ "4_mars\n" + "5_jupiter\n" + "6_satürn\n" + "7_uranüs\n" + "8_neptün\n");
				int secimGezegen = src.nextInt();

				if (secimGezegen == 1) {
					System.out.println(agırlıkMerkür);
				} else if (secimGezegen == 2) {
					System.out.println(agırlıkVenüs);
				} else if (secimGezegen == 3) {
					System.out.println(agırlıkDünya);
				} else if (secimGezegen == 4) {
					System.out.println(agırlıkMars);
				} else if (secimGezegen == 5) {
					System.out.println(agırlıkJupiter);
				} else if (secimGezegen == 6) {
					System.out.println(agırlıkSatürn);
				} else if (secimGezegen == 7) {
					System.out.println(agırlıkUranüs);
				} else if (secimGezegen == 8) {
					System.out.println(agırlıkneptün);
				} else
					System.err.println("!!! HATA !!! yanlis tercih...");
			} else if (secim == 2) {
				System.out.println("Merkür: " + agırlıkMerkür + "\nVenüs: " + agırlıkVenüs + "\nDünya: " + agırlıkDünya
						+ "\nMars: " + agırlıkMars + "\nJupiter: " + agırlıkJupiter + "\nSatürn:" + agırlıkSatürn
						+ "\nUranüs: " + agırlıkUranüs + "\nNeptün: " + agırlıkneptün);
			} else
				System.err.println("!!! HATA !!! yanlis bir rakam girdiniz...");

		}
	}// main

}