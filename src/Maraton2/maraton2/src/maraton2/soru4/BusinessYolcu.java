package maraton2.soru4;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu{
	
	private int BUSINNESFIYAT = 200;
	private int BUSINNESVIPFIYAT = 150;
	private boolean vip;
	private int toplamFiyat;
	private HashMap<String, Integer> biletler= new HashMap<>();

	public  Map<String, Integer> biletListesi = new HashMap<>();

	
	
	
	

	public BusinessYolcu() {
		super();
	}
	public BusinessYolcu(String ad, String soyad, boolean checkin,Boolean vip) {
		super(ad, soyad, checkin);
		this.vip=vip;
	}
	
	public int getBUSINNESFIYAT() {
		return BUSINNESFIYAT;
	}
	public void setBUSINNESFIYAT(int bUSINNESFIYAT) {
		BUSINNESFIYAT = bUSINNESFIYAT;
	}
	public int getBUSINNESVIPFIYAT() {
		return BUSINNESVIPFIYAT;
	}
	public void setBUSINNESVIPFIYAT(int bUSINNESVIPFIYAT) {
		BUSINNESVIPFIYAT = bUSINNESVIPFIYAT;
	}
	
	
	
	


	public int getToplamFiyat() {
		return toplamFiyat;
	}


	public void setToplamFiyat(int toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}


	public HashMap<String, Integer> getBiletler() {
		return biletler;
	}


	public void setBiletler(HashMap<String, Integer> biletler) {
		this.biletler = biletler;
	}

	
	

	@Override
	void yolcuBilgileriniGetir() {
		System.out.println("ad: "+getAd()+" soyad: "+getSoyad()+
				" ücret "+ getToplamFiyat() );
		System.out.println(biletListesi.toString());
	}


	@Override
	void biletAl(FirmaAdi firmaAdi) {
		System.out.println("bilet alindi");
		setFirma(firmaAdi);
		setBilet(true);
		if(biletler.containsKey(firmaAdi.name())) {
			if(vip==true) {
				this.toplamFiyat += (getBASEFIYAT() + this.BUSINNESFIYAT + this.BUSINNESVIPFIYAT);
				biletler.put(firmaAdi.name(), this.toplamFiyat);
				biletListesi.put(firmaAdi.name(), getKoltukNo());
				System.out.println("Bilet alınmıştır. Bilet bilgileriniz: " + biletler + " TL'dir.");
			}else {
				toplamFiyat += (int) (getBASEFIYAT() + this.BUSINNESFIYAT);
				biletler.put(firmaAdi.name(), toplamFiyat);
				biletListesi.put(firmaAdi.name(), getKoltukNo());
				System.out.println("Bilet alınmıştır. Bilet bilgileriniz: " + biletler + " TL'dir.");
			}
		}else {
			if(vip==true) {
				this.toplamFiyat = (getBASEFIYAT() + this.BUSINNESFIYAT + this.BUSINNESVIPFIYAT);
				biletler.put(firmaAdi.name(), this.toplamFiyat);
				biletListesi.put(firmaAdi.name(), getKoltukNo());
				System.out.println("Bilet alınmıştır. Bilet bilgileriniz: " + biletler + " TL'dir.");
			}else {
				toplamFiyat = (int) (getBASEFIYAT() + this.BUSINNESFIYAT);
				biletler.put(firmaAdi.name(), toplamFiyat);
				biletListesi.put(firmaAdi.name(), getKoltukNo());
				System.out.println("Bilet alınmıştır. Bilet bilgileriniz: " + biletler + " TL'dir.");
		}
		}

			
		}
	


	@Override
	void checkInYap() {
		if(isCheckin()&& isBilet()) {
			System.out.println("checkin zaten yapilmis");
		}else if(isBilet() && isCheckin()==false){
			System.out.println("checkin yapildi");
		setCheckin(true);
		}else if(isBilet()==false && isCheckin()==false) {
			System.out.println("önce bilet aliniz");
		}
	}


	@Override
	void ucagaBin() {
		if(isCheckin()) {
			System.out.println("checkin yapilmis ucaga binebilirsiniz...");
		}else {
			System.out.println("checkin yapmadın binemessin");
		}		
	}
	
	

}
