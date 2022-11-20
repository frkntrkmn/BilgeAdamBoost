package odev10_GS_18kasim_impl_inheritence.entity;

public class TeknikDestekKurulum extends TeknikDestek{
	private String kurulumTürü; // internet , evTelefonu, televizyon vs

	
	
	
	@Override
	public String toString() {
		return "TeknikDestekKurulum [kurulumTürü=" + kurulumTürü + ", getBölge()=" + getBölge() + ", getAraba()="
				+ getAraba() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getTelefon()=" + getTelefon()
				+ "]";
	}

	
	
	public TeknikDestekKurulum() {
	}



	public TeknikDestekKurulum(String ad, String soyad, int telefon, String bölge, String araba,String kurulumTürü) {
		super(ad, soyad, telefon, bölge, araba);
		this.kurulumTürü = kurulumTürü;

	}

	

	public TeknikDestekKurulum(String kurulumTürü) {
		this.kurulumTürü = kurulumTürü;
	}

	public String getKurulumTürü() {
		return kurulumTürü;
	}

	public void setKurulumTürü(String kurulumTürü) {
		this.kurulumTürü = kurulumTürü;
	}

}
