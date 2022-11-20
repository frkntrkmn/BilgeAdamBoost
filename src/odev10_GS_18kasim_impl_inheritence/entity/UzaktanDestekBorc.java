package odev10_GS_18kasim_impl_inheritence.entity;

public class UzaktanDestekBorc extends UzaktanDestek {
	private String hesapMakinesiModeli;

	
	
	

	@Override
	public String toString() {
		return "TelefonBorc [hesapMakinesiModeli=" + hesapMakinesiModeli + ", getCalismaSekli()=" + getCalismaSekli()
				+ ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getTelefon()=" + getTelefon() + "]";
	}

	public UzaktanDestekBorc() {
		super();
	}

	

	public UzaktanDestekBorc(String ad, String soyad, int telefon, String calismaSekli,String hesapMakinesiModeli) {
		super(ad, soyad, telefon, calismaSekli);
		this.hesapMakinesiModeli = hesapMakinesiModeli;
	}

	public UzaktanDestekBorc(String hesapMakinesiModeli) {
		super();
		this.hesapMakinesiModeli = hesapMakinesiModeli;
	}

	public String getHesapMakinesiModeli() {
		return hesapMakinesiModeli;
	}

	public void setHesapMakinesiModeli(String hesapMakinesiModeli) {
		this.hesapMakinesiModeli = hesapMakinesiModeli;
	}
	
	

}
