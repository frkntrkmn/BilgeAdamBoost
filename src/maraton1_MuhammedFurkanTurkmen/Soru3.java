package maraton1_MuhammedFurkanTurkmen;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		// String metin = "merhaba bugün JAVA isleceğiz";
		// String metin="Bugün güzel bir gün";

		System.out.print("metin giriniz:");
		String metin = src.nextLine();

		System.out.print("(büyük kücük karakterlere duyarlıdır) aranacak karakter giriniz: ");
		char karakter = src.next().charAt(0);

		karakterSayici(metin, karakter);
	}

	public static void karakterSayici(String metin, char karakter) {
		int sayac = 0; // metin içerisinde kaç adet oldugunu bulmak için kullandık

		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i) == karakter) { // metinde ki "i." karakter aradığımız karaktere eşit mi?
				sayac++;
			}
		}
		if (sayac > 0) { // aranılan karakterin durumunu ekrana bastırmak için kullandık.
			System.out.println("'" + karakter + "' karakterinden " + sayac + " adet var");
		} else {
			System.out.println("aradığınız karakter metic icerisinde yok. " + sayac);
		}

	}
}
