package odev5_GS_HarfBulma;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		boolean dongu = true;
		while (dongu) {
			Scanner src = new Scanner(System.in);
			System.out.print("metin giriniz: ");
			String metin = src.nextLine();

			System.out.print("\nhangi harfi veya kelimeyi arayacağınızı giriniz: ");
			String ara = src.nextLine();

			int first = metin.indexOf(ara);
			int last = metin.lastIndexOf(ara);

			System.out.print("\n-" + ara + " harfinin/kelimesinin geçtiği yerler= ");

			while (first >= 0) {
				if (first < last) {
					System.out.print(first + ",");
					first = metin.indexOf(ara, first + 1);
				} else if (first == last) {
					System.out.print(first);
					first = metin.indexOf(ara, first + 1);
				}
			}
			System.out.println("\n\nMuhammed Furkan Türkmen");
			System.out.print("cikis icin 1 , devam etmek icin herhangi bir sayi giriniz: ");
			int a = src.nextInt();
			System.out.println("***************************\n");
			
			if (a == 1) {
				dongu = false;
			}
		}
	}

}
