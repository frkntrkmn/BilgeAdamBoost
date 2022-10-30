package odev6_27ekim_soru2_switchcase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		boolean tekrar =true;

		/*
		 * Soru2 (40puan) 
		 * Swtich case ile input --> mehmet input--> hangisi işlemi
		 * yapmak istiyosunuz System.out.println("1- Kelimeleri Büyük Harf Yap");
		 * System.out.println("2- kelimenin harflerini Küçük yap");
		 * System.out.println("3- kelimenin harflerinin arasına ? koy"); mehmet
		 * m?h?m?e?t
		 * System.out.println("4- kelimenin başındaki ve sonundaki boşlukları silin");
		 * mehmet 
		 * System.out.println("5- kelimenin içindeki bütün a harflerini ? ile değiştirin"); 
		 * replace
		 * replaceAll("a", ?")
		 * System.out.println("6- kelimenin ilk üç indexinin alıp sonuna ... koyun");
		 * mehmet meh... substring()
		 * 
		 */
		while (tekrar) {
			Scanner src=new Scanner (System.in);

		System.out.print("lütfen bir cümle giriniz:");
		String cümle=src.nextLine();
		System.out.println();
		System.out.println("yapmak istediginz islemi seciniz:\n\n"
				+ "1_harfleri büyük harf yap:\n"
				+ "2_harfleri kücük harf yap:\n"
				+ "3_harflerin arasina soru isareti koy:\n"
				+ "4_kelimenin basindaki ve sonundaki bosluklari silin:\n"
				+ "5_kelimede bulunan bütün a harflerini ? isareti ile degistir:\n"
				+ "6_kelimenin ilk üc indexini alıp kalanınna '...' koy:\n"
				+ "0_cikis yap");
		int secim=src.nextInt();
		System.out.println();
		switch (secim) {
		
		case 1:
			String cümleUp=cümle.toUpperCase();
			System.out.println(cümleUp); break;
		
		case 2:
			String cümleLow=cümle.toLowerCase();
			System.out.println(cümleLow); break;
		
		case 3:
			for(int i=0;i<=cümle.length()-1;i++) {
				System.out.print(cümle.charAt(i)+"?"); 
			}break;
		
		case 4:
			System.out.println(cümle.trim()); break;

		
		case 5:
			
			System.out.println(cümle.replace("a", "?")); 
			
			// büyük harf içinde yapılacak ise
			//System.out.println(cümle.replace("A", "?"));
			
			break;

		case 6: 
			System.out.println(cümle.replace(cümle.substring(3), "..."));
			break;
		case 0:
			tekrar=false;
			System.out.println("cikis yapildi ") ;break;
		default:
			System.out.println("belirtilen disinda giris yaptiniz!!!");
			
		}
		}	
	
	
	}

}
