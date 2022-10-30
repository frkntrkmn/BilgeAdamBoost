package odev4_GS_TersYazdirma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("çevirmek istediğiniz metni veya sayiyi giriniz: ");
		String sayi = src.nextLine();
		
		for (int i = sayi.length() - 1; i >= 0; i--) {
			char tersSayi = sayi.charAt(i);
			System.out.print(tersSayi);
		}

	}
}
