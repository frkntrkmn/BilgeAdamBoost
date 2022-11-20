package odev10_GS_18kasim_impl_inheritence.entity;

public class UzaktanDestekPaket extends UzaktanDestek {
	private String paketBilgisi; // kurumsal mı kişisel mi paketleri biliyor

	
	
	
	
	

	@Override
	public String toString() {
		return "TelefonPaket [paketBilgisi=" + paketBilgisi + ", getCalismaSekli()=" + getCalismaSekli() + ", getAd()="
				+ getAd() + ", getSoyad()=" + getSoyad() + ", getTelefon()=" + getTelefon() + "]";
	}

	public UzaktanDestekPaket() {
		super();
	}

	

	public UzaktanDestekPaket(String ad, String soyad, int telefon, String calismaSekli,String paketBilgisi) {
		super(ad, soyad, telefon, calismaSekli);
		this.paketBilgisi = paketBilgisi;

	}

	public UzaktanDestekPaket(String paketBilgisi) {
		super();
		this.paketBilgisi = paketBilgisi;
	}

	public String getPaketBilgisi() {
		return paketBilgisi;
	}

	public void setPaketBilgisi(String paketBilgisi) {
		this.paketBilgisi = paketBilgisi;
	}

	
	
	


}
