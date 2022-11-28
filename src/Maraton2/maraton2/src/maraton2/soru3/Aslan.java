package maraton2.soru3;

public class Aslan extends MemeliHayvan{
	
	public Aslan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		setTehlikeliMi(true);
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd()+" avina doğru yürüyor.");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd()+" kükrüyor.");
		
	}

	
	

	
	

}
