package maraton2.soru2;

public class CustomStringTR {

	public String str;
	
	public CustomStringTR(String str) {
		this.str=str;
	}


	public int uzunluk() {
		
		return str.length();
	}


	public int indexGetir() {
		return str.charAt(1);
	}
	
	public boolean değerKontrol() {
		return str.contains("a");
	}
	
	public boolean sonDeğerKontrol() {
		return str.endsWith("b");
	}
	
	public int değerArama() {
		return str.indexOf("a");
	}
	
	
	public boolean bosMuKontrol() {
		return str.isEmpty();
	}
	
	public String boslukSilme() {
		return str.strip();
	}
	
	public String bölme() {
		return str.substring(1,3);
	}
	
	public String büyükHarfYapma() {
		return str.toUpperCase();
	}
	public String kücükHarfYapma() {
		return str.toLowerCase();
	}
	public char[] charArrayCevirme() {
		return str.toCharArray();
	}

}
