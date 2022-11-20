package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.UzaktanDestek;

public class UzaktanDestekBorcImpl implements IUzaktanDestek{

	@Override
	public void Destek(UzaktanDestek uzaktanDestek) {
		System.out.println("borcunuz telefonunuza sms ile iletildi.");		
	}

	@Override
	public void telefonAc(UzaktanDestek uzaktanDestek) {	
		uzaktanDestek.setTelefonAcikMi(true);
		System.out.println("merhaba ben borc biriminden "+uzaktanDestek.getAd());
		
	}

	@Override
	public void telefonKapat(UzaktanDestek uzaktanDestek) {
		System.out.println("borc birimi için bana istediğiniz zaman bu numaradan ulasabilirsiniz: "
				+uzaktanDestek.getTelefon()
				+"\niyi günler dileriz...");
		uzaktanDestek.setTelefonAcikMi(false);
	}

	
	

}
