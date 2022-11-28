package maraton2.soru4;

import java.util.Random;

public abstract class Yolcu {

	private int id;
	private String Ad;
	private String soyad; 
	private int koltukNo;
	private boolean checkin;
	private int BASEFIYAT;
	private Random r= new Random();
	private FirmaAdi firma;
	private boolean bilet;

	
	abstract void yolcuBilgileriniGetir() ;
	abstract void biletAl(FirmaAdi firmaAdi) ;
	abstract void checkInYap();
	abstract void ucagaBin() ;
	
	
	
	
	
	public Yolcu() {
		super();
	}
	
	public Yolcu( String ad, String soyad, boolean checkin) {
		this.id = r.nextInt();
		this.Ad = ad;
		this.soyad = soyad;
		this.koltukNo = r.nextInt(1,77);
		this.checkin = checkin;
		this.BASEFIYAT=100;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return Ad;
	}
	public void setAd(String ad) {
		Ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}
	public boolean isCheckin() {
		return checkin;
	}
	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}
	public int getBASEFIYAT() {
		return BASEFIYAT;
	}
	public void setBASEFIYAT(int bASEFIYAT) {
		BASEFIYAT = bASEFIYAT;
	}
	public FirmaAdi getFirma() {
		return firma;
	}
	public void setFirma(FirmaAdi firma) {
		this.firma = firma;
	}
	public boolean isBilet() {
		return bilet;
	}
	public void setBilet(boolean bilet) {
		this.bilet = bilet;
	}
	
	
	
	
	
	
	
}
