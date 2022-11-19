package odev9_17kasım_televizyon.entity;

import java.util.ArrayList;
import java.util.List;

public class Televizyon {
	private String marka;
	private String boyut;
	private boolean kurulum;
	private boolean ac_kapat;
	private int ses;
	private List <Kanal> kanal=new ArrayList<>();

				
	public Televizyon(boolean kurulum, boolean ac_kapat, int ses, List<Kanal> kanal,String marka,String boyut) {
		this.kurulum = kurulum;
		this.marka=marka;
		this.boyut=boyut;
		this.ac_kapat = ac_kapat;
		this.ses = ses;
		this.kanal = kanal;
	}
	
	
	public Televizyon() {
		
		this.kurulum=false;
		this.ac_kapat=false;
		this.ses=10;
	}
	
	
	
			
	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getBoyut() {
		return boyut;
	}


	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}


	public boolean isKurulum() {

		return kurulum;
	}
	public void setKurulum(boolean kurulum) {
		this.kurulum = kurulum;
	}
	public boolean isAc_kapat() {
		return ac_kapat;
	}
	public void setAc_kapat(boolean ac_kapat) {
		this.ac_kapat = ac_kapat;
	}
	public int getSes() {
		return ses;
	}
	public void setSes(int ses) {
		this.ses = ses;
	}
	public List<Kanal> getKanal() {
		return kanal;
	}
	public void setKanal(List<Kanal> kanal) {
		this.kanal = kanal;
	}
	

	
	
	
	
	


}
