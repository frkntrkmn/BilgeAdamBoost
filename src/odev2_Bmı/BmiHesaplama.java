package odev2_Bmı;

import java.util.Scanner;

public class BmiHesaplama {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		while (true) {
			System.out.println("----HOSGELDINIZ----");
			System.out.print("Boyunuzu giriniz(cm): ");
			int boy = src.nextInt();
			System.out.print("kilonuzu giriniz(Kg): ");
			float kilo = src.nextFloat();
			float Bmi = (kilo * 10000) / (boy * boy);

			System.out.println("cinsiyetinizi seciniz:\n1_Bay\n2_Bayan");
			int cinsiyet = src.nextInt();
			if (cinsiyet == 1) {
				if (Bmi < 20) {
					System.out.println("Zatıfsınız... biraz kilo almalısınız.");
				} else if (Bmi >= 20 && Bmi <= 25) {
					System.out.println("Normal Kilodasınız...");
				} else if (Bmi > 25 && Bmi <= 30) {
					System.out.println("Şişmansiniz...bir kaç kilo vermeniz şart.");
				} else if (Bmi > 30) {
					System.out.println("Obez sınıfındasınız... acilen kilo vermeniz lazım.");
				} else
					System.err.println("!!! yanlis değerler girildi... Hesaplanamadı");
			} else if (cinsiyet == 2) {
				if (Bmi < 190) {
					System.out.println("Zatıfsınız... biraz kilo almalısınız.");
				} else if (Bmi >= 19 && Bmi <= 24) {
					System.out.println("Normal Kilodasınız...");
				} else if (Bmi > 25 && Bmi <= 30) {
					System.out.println("Şişmansiniz...bir kaç kilo vermeniz şart.");
				} else if (Bmi > 30) {
					System.out.println("Obez sınıfındasınız... acilen kilo vermeniz lazım.");
				} else
					System.err.println("!!! yanlis değerler girildi... Hesaplanamadı");

			} else {
				System.err.println("cinsiyeti yanlis sectiniz...");
			}
			System.out.println();
		}

	}// main

}
