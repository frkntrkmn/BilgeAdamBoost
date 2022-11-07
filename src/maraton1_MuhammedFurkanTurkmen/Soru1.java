package maraton1_MuhammedFurkanTurkmen;

public class Soru1 {

	public static void main(String[] args) {
		yildiz();

	}

	public static void yildiz() { 

		for (int i = 0; i <= 4; i++) {// aynı yıldız sayısına sahip satırları yazdırmak için
			if (i != 4) { // ilk 4 satır yazıldı
				for (int j = 7; j > 0; j--) {
					System.out.print("* ");
				}
				System.out.println(); // yıldız satırları arasında boş satır olması için 
				System.out.println(); // iki adet println yazıldı. \n de kullanılabilir.

			}else {// kalan satırlar yazıldı
				
				int sembol=6;// ilk durumdan sonra kaç adet yıldıztan başlayalım diye
		        
		        for(int k=0; k<6; k++) { // aşağı doğru kaç yıldız olması için
		            for (int l=0; l <sembol; l++) {
		                System.out.print("* "); //Sembolümüzü belirttik.
		            }
		            System.out.println("\n");// yıldızların arasında bir satır boşluk olduğu için \n yapıyoruz

		            sembol--; //yıldızımızı bire birer azalttık
		        }
		}
	}
}
}