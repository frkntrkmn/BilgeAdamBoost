package odev8_2kasım_sehirVePlaka_dizisi;

public class Main {

	public static void main(String[] args) {

		// 1- verilen sehirler arrayinde ";" dan öncesini ayırıyoruz(split())
		// ayırdğımız bu veriyi yeni bir arraye atıyoruz.
		// ve yeni arrayı ekrana bastırıyoruz,
		// 2- daha sonra
		// “Adananın plaka kodu 01” örnek çıktışı gibi ekrana tekrar bastırıyoruz
		// Sehirleri plaka kodlaradsıyla birlikte bir diziye atayalım daha sonra
		// split()
		// indexOf()
		// substring()

		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		sehirler.trim();
		String[] sehirPlaka;
		String sehirlerSplit[] = sehirler.split(";");

		for (String sehir : sehirlerSplit) {
			System.out.println(sehir);
		}

		System.out.println("\n------------------------------------------------");
		System.out.println("------------------------------------------------\n");

		for (String sehir2 : sehirlerSplit) {
			sehirPlaka = sehir2.split("-");
			System.out.println(sehirPlaka[1] + " plaka kodu:\t" + sehirPlaka[0] + "");
		}

	}

}
