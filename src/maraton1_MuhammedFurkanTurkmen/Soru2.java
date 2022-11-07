package maraton1_MuhammedFurkanTurkmen;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		// İnt sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
		// int sayiDizisi[] = { 0, 1, 5, 3};
		
		//KULLANİCİDAN SAYİ ALIP DİZİYE ATAMAK İÇİN:
		
		Scanner src = new Scanner(System.in);
		System.out.println("dizi uzunluğu giriniz: ");
		int uzunluk = src.nextInt();
		int sayiDizisi[] = new int[uzunluk];
		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.print(i + ". indexi giriniz: ");
			int index = src.nextInt();
			sayiDizisi[i] = index;
		}

		tekrarEdenSayi(sayiDizisi);

	}

	public static void tekrarEdenSayi(int[] dizi) {
		int kontrol, sayac = 1, j, i;
		for (i = 0; i < dizi.length - 1; i++) { // dizinin "i." karakterini kontrol etmek için 
			kontrol = dizi[i]; 
			sayac = 1; // "i." sayının da tekrardan sayılması için 1'den başlatıldı
			for (j = i + 1; j < dizi.length; j++) {
				if (kontrol == dizi[j]) {
					sayac++;

				} else {
				}
			}
			if (sayac > 1 && j == dizi.length) { // son sayıya kadar tekrar tekrar yazdırmasın diye j==dizi.lenght yaptık
				System.out.println(dizi[i] + " sayisi " + sayac + " kere tekrar ediyor");
				break;
			} else if (sayac == 1 && i == dizi.length - 2) { // 
				System.out.println("tekrar eden sayi bulunamamıştır");
			}

		}

	}
}