package odev9_17kasım_televizyon.entity;

import java.util.List;

public class Kanal {
	
	private int kanalNo;

	private String kanalAdi;
	

	public String toString() {
		return "no: "+kanalNo +" kanal: "+kanalAdi;
	}
	
	
	
	
	// cons
	
	
	public Kanal() {
	}
	
	public Kanal(String kanalAdi, int kanalNo) {
		this.kanalAdi = kanalAdi;
		this.kanalNo = kanalNo;
	}
	
	
	
	// get-set
	
	
	public String getKanalAdi() {
		return kanalAdi;
	}
	public void setKanalAdi(String kanalAdi) {
		kanalAdi = kanalAdi;
	}
	
	
	
	public int getKanalNo() {
		return kanalNo;
	}
	public void setKanalNo(int kanalNo) {
		this.kanalNo = kanalNo;
	}

	

}
