package odev9_17kasım_televizyon.entity;

public class MuzikKanali extends Kanal {
	private String muzikTürü;

	
	
	
	public String toString() {
		return "no: "+getKanalNo()+" kanal: "+getKanalAdi()+" tür: "+getMuzikTürü();
	}
	
	public MuzikKanali() {
		super();
	}
	

	public MuzikKanali(String kanalAdi, int kanalNo,String muzikTürü) {
		super(kanalAdi, kanalNo);
		this.muzikTürü = muzikTürü;
	}



	public String getMuzikTürü() {
		return muzikTürü;
	}

	public void setMuzikTürü(String muzikTürü) {
		this.muzikTürü = muzikTürü;
	}
	
	

}
