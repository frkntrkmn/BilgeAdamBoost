package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.UzaktanDestek;

public class UzaktanDestekPaketImpl implements IUzaktanDestek {

	@Override
	public void Destek(UzaktanDestek uzaktanDestek) {
		System.out.println("paket bilgililerimiz telefonunuza iletildi...");
		
	}

	@Override
	public void telefonAc(UzaktanDestek uzaktanDestek) {
		uzaktanDestek.setTelefonAcikMi(true);
		System.out.println("merhaba ben paket biriminden "+uzaktanDestek.getAd());
		
	}

	@Override
	public void telefonKapat(UzaktanDestek uzaktanDestek) {

		System.out.println("paket bilgilerimiz için bana bu numaradan ulasabilirsiniz "+uzaktanDestek.getTelefon());
		System.out.println("iyi günler dileriz");
		uzaktanDestek.setTelefonAcikMi(false);
	}

}
