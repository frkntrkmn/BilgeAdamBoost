package odev6_27ekim_soru3_tahminoyunu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int i = 0;
		// Soru3 (40 puan)

		// Tahmin oyunu
		// rastGele bir sayı oluşturcaz
		// rastgele sayı oluşturma--> int rastGeleSayi = (int) (Math.random() * 100);
		// o sayıyı tahmin etmeye çalışcaz
		// tahmin ettiğimiz sayı bulcağımız sayıdan fazla ise tahmini azalt yazdırın
		// az ise tahmini artır yazalım
		// sayıyı bulduğumuzda kaçıncı seferde bulduğumuzu yazdıralım
		// Her yanlış tahminde döngüden çıkmadan bize tekrar tahminimizi sorsun .
		// while ile çözüm

		int rastgeleSayi = (int) (Math.random() * 100);

		System.out.print("tahmininizi giriniz: ");
		int tahmin = sr.nextInt();

		while (true) {
			Scanner src = new Scanner(System.in);

			if (rastgeleSayi < tahmin) {
				System.out.print("daha düşük bir sayi giriniz:");
				tahmin = src.nextInt();
				i++;
			}

			else if (rastgeleSayi > tahmin) {
				System.out.print("daha yüksek bir sayi giriniz:");
				tahmin = src.nextInt();
				i++;
			}

			else if (rastgeleSayi == tahmin) {
				System.out.println("bravooo!!! sayiyi " + i + " tekrarda doğru tahmin ettiniz");
				break;
			}
		}

	}

}
