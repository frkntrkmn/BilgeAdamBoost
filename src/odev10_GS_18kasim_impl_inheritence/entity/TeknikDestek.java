package odev10_GS_18kasim_impl_inheritence.entity;

public class TeknikDestek extends Calisan {
	private String bölge;
	private String araba;
	
	
	
	
	
	@Override
	public String toString() {
		return "TeknikDestek [bölge=" + bölge + ", araba=" + araba + ", getAd()=" + getAd() + ", getSoyad()="
				+ getSoyad() + ", getTelefon()=" + getTelefon() + "]";
	}
	public TeknikDestek() {
		super();

	}
	public TeknikDestek(String ad, String soyad, int telefon) {
		super(ad, soyad, telefon);
	}
	
	public TeknikDestek(String ad, String soyad, int telefon,String bölge, String araba) {
		super(ad, soyad, telefon);
		this.bölge = bölge;
		this.araba = araba;
	}
	
	public String getBölge() {
		return bölge;
	}
	public void setBölge(String bölge) {
		this.bölge = bölge;
	}
	public String getAraba() {
		return araba;
	}
	public void setAraba(String araba) {
		this.araba = araba;
	}
	
	

}
