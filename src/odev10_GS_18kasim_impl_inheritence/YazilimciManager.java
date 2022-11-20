package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.Yazilimci;

public class YazilimciManager {
	IYazilimci iYazilimci;

	
	public YazilimciManager(IYazilimci iYazilimci) {
		this.iYazilimci = iYazilimci;
	}


	public void yazilimciKontrol(Yazilimci yazilimci) {
		if(yazilimci.getDil()=="java" || yazilimci.getDil()=="c++"|| yazilimci.getDil()==".net") {
			iYazilimci.kodlamaYap(yazilimci);
			iYazilimci.kodGüncelle(yazilimci);
			iYazilimci.kodSil(yazilimci);
			System.out.println("----------------------------------------------------------");
			
		}else if(yazilimci.getDil()=="css" || yazilimci.getDil()=="html"|| yazilimci.getDil()=="javascript") {
			iYazilimci.kodlamaYap(yazilimci);
			iYazilimci.kodGüncelle(yazilimci);
			iYazilimci.kodSil(yazilimci);
			System.out.println("----------------------------------------------------------");

		}else {
			System.out.println("yazilimci kontrolünden kaldi kodlama yapamaz...");
		}
		
	}

}
