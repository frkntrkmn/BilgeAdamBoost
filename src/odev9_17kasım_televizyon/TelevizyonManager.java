package odev9_17kasım_televizyon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import odev9_17kasım_televizyon.entity.HaberKanali;
import odev9_17kasım_televizyon.entity.Kanal;
import odev9_17kasım_televizyon.entity.MuzikKanali;
import odev9_17kasım_televizyon.entity.Televizyon;

public class TelevizyonManager {

	Televizyon televizyon = new Televizyon();
	int i = 0;

	Scanner src = new Scanner(System.in);

	public void menu() throws InterruptedException {
		System.out.println();

		System.out.print("---MENU---"
				+ "\n1_tv Kurma"
				+ "\n2_tv ac"
				+ "\n3_tv kapat"
				+ "\n4_ses artır"
				+ "\n5_ses azalt "
				+ "\n6_kanal değis"
				+ "\n7_kanal bilgisi"
				+ "\n\nSecim Yapiniz:	");
		
		
		int secim = src.nextInt();
		switch (secim) {

		case 1: {
			kurulum();
			menu();
			break;

		}
		case 2: {
			tvAc();
			menu();
			break;
		}
		case 3: {
			tvKapat();
			menu();
			break;

		}
		case 4: {
			sesArttır();
			menu();
			break;

		}
		case 5: {
			sesAzalt();
			menu();
			break;

		}

		case 6: {
			kanalDegis();
			menu();
			break;

		}
		case 7:{
			kanalBilgisi();
			menu();
			break;
			
		}

		default:{
			System.out.println("yanlis değer girdiniz...");
			menu();
		}
		}
		System.out.println();
	}

	public void kurulum() {
		Scanner src = new Scanner(System.in);

		if (televizyon.isKurulum()) {
			System.out.println("tv daha once kuruldu...");
		} else {
			System.out.println("tv markasini giriniz: ");
			String marka = src.nextLine();
			televizyon.setMarka(marka);
			System.out.println("boyut giriniz: ");
			String boyut = src.nextLine();
			televizyon.setBoyut(boyut);
			System.out.println("tvniz kuruldu");
			televizyon.setKurulum(true);
			kanalKur();
			System.out.println(
					"---Tv bilgileri---\nmarka: " + televizyon.getMarka() + "\nboyut: " + televizyon.getBoyut());
		}

	}

	public String kanalGoster() {
		return televizyon.getKanal().toString();
	}

	public void tvAc() throws InterruptedException {
		if (televizyon.isKurulum()) {
			if (televizyon.isAc_kapat()) {
				System.out.println("tv zaten acık...");
			} else {
				System.out.println("tv aciliyor");
				Thread.sleep(500);
				System.out.println("tv acildi...");
				televizyon.setAc_kapat(true);
			}
		} else {
			System.out.println("once tvyi kur");
		}

	}

	public void tvKapat() throws InterruptedException {
		if (televizyon.isKurulum()) {

			if (televizyon.isAc_kapat()) {
				System.out.println("tv kapaniyor...");
				Thread.sleep(1000);
				System.out.println("tv kapandi");
				televizyon.setAc_kapat(false);
			} else {
				System.out.println("tv zaten kapali");
			}
		} else {
			System.out.println("once tvyi kur");
		}

	}

	public void sesArttır()  {

		if (televizyon.isKurulum() && televizyon.isAc_kapat()) {
			if (televizyon.getSes() < 100) {
				televizyon.setSes(televizyon.getSes() + 1);
				System.out.println("ses: " + televizyon.getSes());
			} else {
				System.out.println("maksimum ses seviyesine ulaşıldı");
			}
		}

		else if (televizyon.isKurulum() && televizyon.isAc_kapat() == false) {
			System.out.println("tv acik degil");
		} else {
			System.out.println("tv kurulu değil");
		}
	}

	public void sesAzalt()  {

		if (televizyon.isKurulum() && televizyon.isAc_kapat()) {
			if (televizyon.getSes() > 0) {
				televizyon.setSes(televizyon.getSes() - 1);
				System.out.println("ses: " + televizyon.getSes());
			} else {
				System.out.println("minimum ses seviyesine ulaşıldı");
			}
		}

		else if (televizyon.isKurulum() && televizyon.isAc_kapat() == false) {
			System.out.println("tv acik degil");
		} else {
			System.out.println("tv kurulu değil");
		}

	}

	public void kanalDegis()  {

		if (televizyon.isKurulum() && televizyon.isAc_kapat()) {

			if (i < televizyon.getKanal().size()-1) {
				i++;
				System.out.println(televizyon.getKanal().get(i));
				
			} else {
				System.out.println("kanallar basa döndü");
				i = 0;
			}

		} else if (televizyon.isKurulum() && televizyon.isAc_kapat() == false) {
			System.out.println("tv acik degil");

		} else {
			System.out.println("kurulum yapilmamis");

		}

	}

	public void kanalBilgisi() {


		if (televizyon.isKurulum() && televizyon.isAc_kapat()) {
			
			System.out.println(televizyon.getKanal().get(i).toString());

			
		} else if (televizyon.isKurulum() && televizyon.isAc_kapat() == false) {
			System.out.println("tv acik degil");

		} else {
			System.out.println("kurulum yapilmamis");

		}
	}

	public void kanalKur() {
		Kanal kanal1=new HaberKanali("CNN TV", 1, "son dakika haber");
		Kanal kanal2=new HaberKanali("TRT TV ", 2, "Türkiyeden sıcak gelişmeler");
		Kanal kanal3=new HaberKanali("Habertürk radyo", 3, "7/24 haber ");
		Kanal kanal4=new MuzikKanali("DreamTürk radyo", 4, "türkçe hit şarkılar");
	
		televizyon.getKanal().add(kanal1);
		televizyon.getKanal().add(kanal2);
		televizyon.getKanal().add(kanal3);
		televizyon.getKanal().add(kanal4);

	}
}
