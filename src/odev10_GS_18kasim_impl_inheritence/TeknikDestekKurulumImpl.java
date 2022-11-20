package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.TeknikDestek;

public class TeknikDestekKurulumImpl extends AbstractTeknikDestek {

	@Override
	void destek(TeknikDestek teknikDestek) {
		System.out.println(teknikDestek.getAd()+" kurulumu tamamladi.");
				
	}



}
