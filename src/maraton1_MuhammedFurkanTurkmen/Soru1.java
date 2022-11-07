package maraton1_MuhammedFurkanTurkmen;

public class Soru1 {

	public static void main(String[] args) {
		yildiz();

	}

	public static void yildiz() { 

		for (int i = 0; i <= 4; i++) {
			if (i != 4) {
				for (int j = 7; j > 0; j--) {
					System.out.print("* ");
				}
				System.out.println();
				System.out.println();

			}else {
				
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