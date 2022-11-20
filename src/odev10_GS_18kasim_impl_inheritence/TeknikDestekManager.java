package odev10_GS_18kasim_impl_inheritence;

import odev10_GS_18kasim_impl_inheritence.entity.TeknikDestek;

public class TeknikDestekManager {
	// bu sınıf interface veya abstract sınıfından nesne oluşturuyor ve
	// bu sinifin/interface nin constructor'ını içinde barındırıyor.
	// neden: TeknikDestekManager yani şuan ki sınıftan new diyerek nesne oluşturunca
	// aynı zaman AbsTeknikDestek sınıfından da nesne oluşturuyorum ki
	// AbsTeknikDestek nesnem ne ile ilgili ise onun özelliklerini çağırıyorum
	// böylece bir sınıfa bağımlılık azalıyor. sadece interface veya abstract sınıf ile iletişim kuruyorum.
	// AbsTeknikDestek türünde bir nesne ver bana ne verdiğin fark etmez
	// sadece AbsTeknikDestek türünde olmasi yeterli diyorum.
	
	AbstractTeknikDestek absTeknikDestek;

	public TeknikDestekManager(AbstractTeknikDestek absTeknikDestek) {
		this.absTeknikDestek = absTeknikDestek;
	}
	
	
	// bu methodlarda da kendi isteklerimizi gerçekleştiriyoruz
	// teknik desteklerin bölgelerini kontrol ediyoruz mesela bu methoda
	// bölge kontrolü yapıyoruz ve ona göre işlemlerimizi yazıyoruz.
	
	public void bölge(TeknikDestek teknikDestek) {
		if(teknikDestek.getBölge()=="ankara") {
			System.out.println("teknik destek ankaraya yola cikti");
			absTeknikDestek.bölgeyeGit();
			absTeknikDestek.destek(teknikDestek);
			absTeknikDestek.bölgedenAyril();
			
		}else if(teknikDestek.getBölge()=="istanbul") {
			System.out.println("teknik destek istanbula yola cikti");
			absTeknikDestek.bölgeyeGit();
			absTeknikDestek.destek(teknikDestek);
			absTeknikDestek.bölgedenAyril();
		}else {
			System.out.println("bölge disarisinda kaldiğiniz için teknik destek veremiyoruz...");
		}
		
	}
	

}
