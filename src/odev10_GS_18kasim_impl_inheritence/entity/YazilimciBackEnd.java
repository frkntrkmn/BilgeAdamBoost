package odev10_GS_18kasim_impl_inheritence.entity;

public class YazilimciBackEnd extends Yazilimci {

	private String veriTabaniBilgisi;

	
	
	
	
	@Override
	public String toString() {
		return "BackEnd_Yazilimci [veriTabaniBilgisi=" + veriTabaniBilgisi + ", getDil()=" + getDil()
				+ ", getBilgisayar()=" + getBilgisayar() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getTelefon()=" + getTelefon() + "]";
	}

	public YazilimciBackEnd() {
		super();
	}

	
	
	
	
	public YazilimciBackEnd(String ad, String soyad, int telefon, String dil, String bilgisayar,String veriTabaniBilgisi) {
		super(ad, soyad, telefon, dil, bilgisayar);
		this.veriTabaniBilgisi = veriTabaniBilgisi;

	}

	public YazilimciBackEnd(String dil, String bilgisayar) {
		super(dil, bilgisayar);
	}

	public YazilimciBackEnd(String veriTabaniBilgisi) {
		super();
		this.veriTabaniBilgisi = veriTabaniBilgisi;
	}

	public String getVeriTabaniBilgisi() {
		return veriTabaniBilgisi;
	}

	public void setVeriTabaniBilgisi(String veriTabaniBilgisi) {
		this.veriTabaniBilgisi = veriTabaniBilgisi;
	}
	
	
}
