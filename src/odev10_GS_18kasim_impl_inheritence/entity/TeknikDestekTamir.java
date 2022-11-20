package odev10_GS_18kasim_impl_inheritence.entity;

public class TeknikDestekTamir extends TeknikDestek {
	private String tamirTürü; // uydu, kablo, modem , tvekranı vs...

	
	
	
	
	
	public TeknikDestekTamir() {
	}

	public TeknikDestekTamir(String ad, String soyad, int telefon, String bölge, String araba,String tamirTürü) {
		super(ad, soyad, telefon, bölge, araba);
		this.tamirTürü = tamirTürü;
	}

	public TeknikDestekTamir(String ad, String soyad, int telefon) {
		super(ad, soyad, telefon);
	}
	

	public TeknikDestekTamir(String tamirTürü) {
		this.tamirTürü = tamirTürü;
	}

	public String getTamirTürü() {
		return tamirTürü;
	}

	public void setTamirTürü(String tamirTürü) {
		this.tamirTürü = tamirTürü;
	}

	
	
	
	
	
	
	
}
