package odev10_GS_18kasim_impl_inheritence.entity;

public class YazilimciFrontEnd extends Yazilimci {
	
	private String yazilimBilgisi;

	
	
	
	@Override
	public String toString() {
		return "FrontEnd_Yazilimci [yazilimBilgisi=" + yazilimBilgisi + ", getDil()=" + getDil() + ", getBilgisayar()="
				+ getBilgisayar() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + "]";
	}

	public YazilimciFrontEnd() {
		super();
	}

	

	public YazilimciFrontEnd(String ad, String soyad, int telefon, String dil, String bilgisayar,String yazilimBilgisi) {
		super(ad, soyad, telefon, dil, bilgisayar);
		this.yazilimBilgisi = yazilimBilgisi;

	}

	public YazilimciFrontEnd(String dil, String bilgisayar) {
		super(dil, bilgisayar);
	}

	public YazilimciFrontEnd(String yazilimBilgisi) {
		super();
		this.yazilimBilgisi = yazilimBilgisi;
	}

	public String getYazilimBilgisi() {
		return yazilimBilgisi;
	}

	public void setYazilimBilgisi(String yazilimBilgisi) {
		this.yazilimBilgisi = yazilimBilgisi;
	}
	

}
