package maraton2.soru3;
public abstract class  MemeliHayvan extends Hayvan {
	
	public MemeliHayvan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
	}

	public abstract void yuru();

	@Override
	public String toString() {
		if(isTehlikeliMi()) {
			return "memeli Hayvanımızın adi: " + getAd() + ", kilosu=" + getKilo() + ", uzunluğu()=" + getUzunluk()
			+ ", bu hayvan tehlikelidir yaklasmayiniz" ;
		}else {
			return "memeli Hayvanımızın adi: " + getAd() + ", kilosu=" + getKilo() + ", uzunluğu()=" + getUzunluk()
			+ ", cok sevecendir sevebilirisiniz" ;
		}

	}
	
	
}
