package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.UzaktanDestek;

public class UzaktanDestekManager {
	
	
	IUzaktanDestek iUzaktanDestek;

	public UzaktanDestekManager(IUzaktanDestek iUzaktanDestek) {
		this.iUzaktanDestek = iUzaktanDestek;
	}

	public void telefonNoSorgua(UzaktanDestek uzaktanDestek) {
		if(uzaktanDestek.getTelefon()==222) {
			System.out.println("borc birimine yönlendirildi");
			iUzaktanDestek.telefonAc(uzaktanDestek);
			iUzaktanDestek.Destek(uzaktanDestek);
			iUzaktanDestek.telefonKapat(uzaktanDestek);
			System.out.println("----------------------------------------------------------");
		}else if(uzaktanDestek.getTelefon()==333) {
			System.out.println("paket birimine yönlendirildi");
			iUzaktanDestek.telefonAc(uzaktanDestek);
			iUzaktanDestek.Destek(uzaktanDestek);
			iUzaktanDestek.telefonKapat(uzaktanDestek);
			System.out.println("----------------------------------------------------------");

		}else {
			System.out.println("yanlis telefon numarasi verilmis"+
		"borc birimi için: 222 \n paket birimi için: 333 veriniz...");
			System.out.println("----------------------------------------------------------");

		}

	}
}
