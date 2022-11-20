package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.TeknikDestek;
import odev10_GS_18kasim_impl_inheritence.entity.TeknikDestekKurulum;
import odev10_GS_18kasim_impl_inheritence.entity.TeknikDestekTamir;
import odev10_GS_18kasim_impl_inheritence.entity.UzaktanDestek;
import odev10_GS_18kasim_impl_inheritence.entity.UzaktanDestekBorc;
import odev10_GS_18kasim_impl_inheritence.entity.UzaktanDestekPaket;
import odev10_GS_18kasim_impl_inheritence.entity.Yazilimci;
import odev10_GS_18kasim_impl_inheritence.entity.YazilimciBackEnd;
import odev10_GS_18kasim_impl_inheritence.entity.YazilimciFrontEnd;


public class Main {

	public static void main(String[] args) {
		// --------------CALİSAN İNSANLAR----------CALİSAN İNSANLAR---------------CALİSAN İNSANLAR----------------
		
		TeknikDestek teknikDestekKurulum= new TeknikDestekKurulum("furkan", "Türkmen", 505, "ankara", "ford", "modem");
		TeknikDestek teknikDestekKurulum1= new TeknikDestekKurulum("onur", "çınar", 213, "istanbul", "ford", "modem");

		TeknikDestek teknikDestekTamir= new TeknikDestekTamir("mehmet", "yilmzr", 0532, "ankara", "VW", "modem");
		TeknikDestek teknikDestekTamir1= new TeknikDestekTamir("tayfun", "altın", 485555, "istanbul", "VW", "modem");
		
		UzaktanDestek uzaktanDestekBorc= new UzaktanDestekBorc("ali","vural",222, "uzaktan", "casio");
		UzaktanDestek uzaktanDestekpaket= new UzaktanDestekPaket("şeyma","kus",333, "uzaktan", "is");
		
		Yazilimci yazilimciBackEnd= new YazilimciBackEnd("abdullah", "pakistanliys", 90578, "java", "dell" , "PostgreSql");
		Yazilimci yazilimciFrontEnd= new YazilimciFrontEnd("peaky", "hindisanlys", 702655, "html", "lenova" , "react");


		// --------------CALİSAN İNSANLAR----------CALİSAN İNSANLAR---------------CALİSAN İNSANLAR----------------
		
		
		
		// !!!! -------ÖNEMLİ-------ÖNEMLİ-------ÖNEMLİ-------ÖNEMLİ-------ÖNEMLİ-------ÖNEMLİ !!!!
		// bağımlılık azaltma
		// TeknikDestekManager kısmında anlatın şey burada gerçekleşiyor
		// TeknikDestekManager new'lendiği zaman içine AbsTeknikDestek abstract sınıfını implement etmiş
		// herhangi bir sınıfı verebiliyorum
		// önce  Kurulumİmpl sınıfından nesne verdim ve onun özelliklerini çalıştırdım
		// daha Sonra Tamirİmpl sınıfından nesne verdim ve bu sefer de tamir'in sıfınının özelliklerini kullandım
		
		TeknikDestekManager teknikDestekManager= new TeknikDestekManager(new TeknikDestekKurulumImpl());
		teknikDestekManager.bölge(teknikDestekKurulum);
		teknikDestekManager.bölge(teknikDestekKurulum1);
		/* cikti:		teknik destek ankaraya yola cikti
						ulasildi.
						furkan kurulumu tamamladi.
						Destek ekibi bölgeden ayriliyor.
						----------------------------------------------------------
						teknik destek istanbula yola cikti
						ulasildi.
						onur kurulumu tamamladi.
						Destek ekibi bölgeden ayriliyor.*/
		
		
		
		TeknikDestekManager teknikDestekManager1= new TeknikDestekManager(new TeknikDestekTamirImpl());
		teknikDestekManager1.bölge(teknikDestekTamir);
		teknikDestekManager1.bölge(teknikDestekTamir1);
		/* cikti:		teknik destek ankaraya yola cikti
						ulasildi.
						mehmet tamir işlemini yapti
						Destek ekibi bölgeden ayriliyor.
						----------------------------------------------------------
						teknik destek istanbula yola cikti
						ulasildi.
						tayfun tamir işlemini yapti
						Destek ekibi bölgeden ayriliyor.                 */
		
		
											
		UzaktanDestekManager uzaktanDestekManager= new UzaktanDestekManager(new UzaktanDestekBorcImpl());
		uzaktanDestekManager.telefonNoSorgua(uzaktanDestekBorc);
		/* cikti:		borc birimine yönlendirildi
						merhaba ben borc biriminden ali
						borcunuz telefonunuza sms ile iletildi.
						borc birimi için bana istediğiniz zaman bu numaradan ulasabilirsiniz: 222
						iyi günler dileriz...          */
		 
					
		
		UzaktanDestekManager uzaktanDestekManager1= new UzaktanDestekManager(new UzaktanDestekPaketImpl());
		uzaktanDestekManager1.telefonNoSorgua(uzaktanDestekpaket);
		/* cikti:		paket birimine yönlendirildi
						merhaba ben paket biriminden şeyma
						paket bilgililerimiz telefonunuza iletildi...
						paket bilgilerimiz için bana bu numaradan ulasabilirsiniz 333
						iyi günler dileriz 			*/
		
		
		
		YazilimciManager yazilimciManager= new YazilimciManager(new YazilimciBackEndImpl());
		yazilimciManager.yazilimciKontrol(yazilimciBackEnd);
		/* cikti:		abdullah tarafindan java ile kodlama yapildi
			 			abdullah tarafindan java kodlari güncellendi
						abdullah tarafindan java kodlari silindi   */
		
		YazilimciManager yazilimciManager1= new YazilimciManager(new YazilimciFrontEndImpl());
		yazilimciFrontEnd.setDil("c");
		yazilimciManager1.yazilimciKontrol(yazilimciFrontEnd);;
		// cikti: 		yazilimci kontrolünden kaldi kodlama yapamaz...

		
	
	}


}






