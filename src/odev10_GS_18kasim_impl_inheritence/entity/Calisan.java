package odev10_GS_18kasim_impl_inheritence.entity;

public class Calisan {
	private String ad;
	private String soyad;
	private int telefon;
	
	
	
	
	
	
	public Calisan() {
	}
	
	
	public Calisan(String ad, String soyad, int telefon) {
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
	}
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	
	
}
