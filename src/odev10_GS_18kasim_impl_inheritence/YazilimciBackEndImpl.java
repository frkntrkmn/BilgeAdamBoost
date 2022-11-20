package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.Yazilimci;

public class YazilimciBackEndImpl implements IYazilimci {

	@Override
	public void kodlamaYap(Yazilimci yazilimci) {
		System.out.println(yazilimci.getAd()+" tarafindan "+yazilimci.getDil()+" ile kodlama yapildi");
		
	}

	@Override
	public void kodSil(Yazilimci yazilimci) {
		System.out.println(yazilimci.getAd()+" tarafindan "+yazilimci.getDil()+" kodlari silindi");
		
	}

	@Override
	public void kodGüncelle(Yazilimci yazilimci) {
		System.out.println(yazilimci.getAd()+" tarafindan "+yazilimci.getDil()+" kodlari güncellendi");
	}

}
