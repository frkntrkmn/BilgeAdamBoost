package odev6_27ekim_soru1_a_b_ilebaslama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * Soru1 (20 puan) 
		 * kullanıcıdan bir kelime alın eğer kelime a ile başlıyorsa
		 * kelimenin son indexini ekrana bastırın
		 * eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin
		 * eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın
		 *
		 */
		
		Scanner src = new Scanner(System.in);
		System.out.print("kelime giriniz: ");
		String klm = src.nextLine();
		// büyük kücük harf duyarliligi için yapiyoruz
		String kelime = klm.toLowerCase();

		if (kelime.startsWith("a")) {
			System.out.println("son index: " + kelime.charAt(kelime.length() - 1));

		} else if (kelime.startsWith("b")) {
			/*
			 * ilk index dediginiz için 0.indexi degiştirmemiz lazım. 0.index de "b" ye denk
			 * gelmektedir. birinci indexi degiştirmek istersek de böyle bir çözüm yaptım.
			 * 1.indexteki harf kelimenin devamında varsa onlar da etkilenmesin diye böyle
			 * bir çözüm yapıyorum. sadece birinci index'i degiştirmek için: önce kelimenin
			 * ilk indexini yeni bir String'e tanımlıyorum: kelime2 daha sonra bu
			 * tanımladıgım kelime2'yi degiştiriyorum ki devamı etkilenmesin. degiştirilmiş
			 * kelimeyi de yeni bir String'e atıyorum: yeniKelime 
			 * 
			 * String kelime2 =kelime.substring(1, 2); 
			 * String yeniKelime = kelime.replaceFirst(kelime2,"@"); 
			 * System.out.println(yeniKelime);
			 */

			String degisimb = kelime.replaceFirst("b", "@");
			System.out.println("0.indexi(b) degisimi: " + degisimb);
		} else {
			System.out.println("1.indexi: " + kelime.charAt(1));
		}

	}

}
