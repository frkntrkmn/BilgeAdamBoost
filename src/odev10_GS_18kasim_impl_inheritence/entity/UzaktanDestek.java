package odev10_GS_18kasim_impl_inheritence.entity;

public class UzaktanDestek extends Calisan{
	private String calismaSekli;
	private Boolean telefonAcikMi;

	
	
	
	
	
	public UzaktanDestek() {
		super();
	}

	public UzaktanDestek(String ad, String soyad, int telefon,String calismaSekli) {
		super(ad, soyad, telefon);
		this.calismaSekli = calismaSekli;
		this.telefonAcikMi=false;
	}

	public UzaktanDestek(String calismaSekli) {
		super();
		this.calismaSekli = calismaSekli;
	}
	

	public String getCalismaSekli() {
		return calismaSekli;
	}

	public void setCalismaSekli(String calismaSekli) {
		this.calismaSekli = calismaSekli;
	}

	public Boolean getTelefonAcikMi() {
		return telefonAcikMi;
	}

	public void setTelefonAcikMi(Boolean telefonAcikMi) {
		this.telefonAcikMi = telefonAcikMi;
	}
	
	

	
}
