package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.TeknikDestek;

public abstract class AbstractTeknikDestek {
	
	// bu sınıf destek ekibinin neler yapabileceğini kontrol ediyor.
	// impl sınıfları bu sınıfdan implement ediliyor burası o impl sınıflara 
	// hangi eylemleri gerçekleştirebileceğini söyleyen sınıf
	
	
	abstract void destek(TeknikDestek teknikDestek); 
	
	void bölgeyeGit() {
		 System.out.println("ulasildi.");
	 }
	
	
	void bölgedenAyril() {
		System.out.println("Destek ekibi bölgeden ayriliyor.");
		System.out.println("----------------------------------------------------------");
		
	}
	 

}
