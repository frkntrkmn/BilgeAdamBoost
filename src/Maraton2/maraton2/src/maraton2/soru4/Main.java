package maraton2.soru4;

public class Main {
public static void main(String[] args) {
	
	
	
	System.out.println("------EKONOMİ-------");
	EkonomiYolcu yolcu= new EkonomiYolcu("Furkan","Türkmen",false);
	yolcu.biletAl(FirmaAdi.ANADOLUJEY);
	yolcu.biletAl(FirmaAdi.PEGASUS);
	yolcu.biletAl(FirmaAdi.ANADOLUJEY);



	yolcu.yolcuBilgileriniGetir();
	yolcu.ucagaBin();
	yolcu.checkInYap();
	yolcu.ucagaBin();
	System.out.println();

	
	System.out.println("------BUSİNESSvip-------");

	Yolcu yolcu2= new BusinessYolcu("Muhammed ","Yilmazer",false,true);
	yolcu2.biletAl(FirmaAdi.PEGASUS);
	yolcu2.biletAl(FirmaAdi.PEGASUS);

	yolcu2.checkInYap();
	yolcu2.yolcuBilgileriniGetir();
	yolcu2.ucagaBin();
	System.out.println();

	System.out.println("------BUSİNESS-------");

	Yolcu yolcu3= new BusinessYolcu("Onur","Sarac",false,false);

	yolcu3.biletAl(FirmaAdi.THY);
	yolcu3.checkInYap();
	yolcu3.ucagaBin();
	yolcu3.yolcuBilgileriniGetir();

}
}
