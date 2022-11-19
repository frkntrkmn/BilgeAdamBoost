package odev9_17kasım_televizyon.entity;

public class HaberKanali extends Kanal {
	
	private String haberTürü;

	public String toString() {
		return "no: "+getKanalNo()+" kanal: "+getKanalAdi()+" tür: "+getHaberTürü();
	}

	public HaberKanali(String kanalAdi, int kanalNo,String haberTürü) {
		super(kanalAdi, kanalNo);
		this.haberTürü = haberTürü;
	}

	public HaberKanali() {
	}


	public String getHaberTürü() {
		return haberTürü;
	}

	public void setHaberTürü(String haberTürü) {
		this.haberTürü = haberTürü;
	}
	

}
