package maraton1_MuhammedFurkanTurkmen;

import java.util.Scanner;

public class Soru4 {

	// tüm methodlarda ortak olması için class seviyesinde tanımladık ve
	// dğer methodlarda kullanabilmek için static yaptık
	static double sonuc;
	static Scanner src = new Scanner(System.in);

	public static void main(String[] args) {

		int islem;

		// en az bir kere girmesi için do-while ile yaptık
		do {
			sonuc = 0;
			System.out.println("hangi islemi yapmak istersiniz: \n" 
			+ "1. Kare alan hesaplama\n"		
			+ "2. Kare çevre hesaplama\n" 
			+ "3. Dikdörtgen alan hesaplama\n" 
			+ "4. Dikdörtgen çevre hesaplama\n"
			+ "5. Daire alan hesaplama\n" 
			+ "6. Daire Çevre hesaplama\n" 
			+ "7. Çıkış");

			islem = src.nextInt();

			switch (islem) {
			case 1: {
				kareAlan();
				break;
			}
			case 2: {
				kareCevre();
				break;
			}
			case 3: {
				dikdortgenAlan();
				break;
			}
			case 4: {
				dikdortgenCevre();
				break;
			}
			case 5: {
				daireAlan();
				break;
			}
			case 6: {
				daireCevre();
				break;
			}
			default:
				System.out.println("yanlis tercih yaptiniz asağida ki secimleriden birini secebilirisiz:");
			}// switch
			if (islem != 7) { // cikis islemi için if-else tanımlandı
				System.out.println(sonuc + "\n");
			} else
				System.out.println("cikis yapildi");
		} // do
		while (islem != 7);

	}

	public static void kareAlan() {
		System.out.print("kenar uzunluğu giriniz: ");
		double kenar = src.nextDouble();
		sonuc = kenar * kenar;

	}

	public static void kareCevre() {
		System.out.print("kenar uzunluğu giriniz: ");
		double kenar = src.nextDouble();
		sonuc = kenar * 4;

	}

	public static void dikdortgenAlan() {
		System.out.print("ilk kenar uzunluğunu giriniz: ");
		double kenar = src.nextDouble();
		System.out.print("ikinci kenar uzunluğunu giriniz: ");
		double kenar1 = src.nextDouble();
		sonuc = kenar * kenar1;
	}

	public static void dikdortgenCevre() {
		System.out.print("ilk kenar uzunluğunu giriniz: ");
		double kenar = src.nextDouble();
		System.out.print("ikinci kenar uzunluğunu giriniz: ");
		double kenar1 = src.nextDouble();
		sonuc = (kenar * 2) + (kenar1 * 2);
	}

	public static void daireAlan() {
		System.out.print("yaricap giriniz: ");
		double r = src.nextDouble();
		sonuc = (r * r) * Math.PI;
	}

	public static void daireCevre() {
		System.out.print("yaricap giriniz:");
		double r = src.nextDouble();
		sonuc = 2 * r * Math.PI;
	}

}
