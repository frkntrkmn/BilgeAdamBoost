package odev10_GS_18kasim_impl_inheritence.entity;

public class Yazilimci extends Calisan {

	private String dil;
	private String bilgisayar;
	
	
	
	
	
	
	
	public Yazilimci() {
		super();
	}
	public Yazilimci(String ad, String soyad, int telefon,String dil, String bilgisayar) {
		super(ad, soyad, telefon);
		this.dil = dil;
		this.bilgisayar = bilgisayar;
	}
	
	public Yazilimci(String dil, String bilgisayar) {
		super();
		this.dil = dil;
		this.bilgisayar = bilgisayar;
	}
	
	
	public String getDil() {
		return dil;
	}
	public void setDil(String dil) {
		this.dil = dil;
	}
	public String getBilgisayar() {
		return bilgisayar;
	}
	public void setBilgisayar(String bilgisayar) {
		this.bilgisayar = bilgisayar;
	}
	
	
}
