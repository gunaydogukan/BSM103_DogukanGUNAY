package odev;

public class Dogukan_Gunay_uygulama1 {

	public static void main(String[] args) {
		
		ilkmetot();
		int gelendeger=ikincimetot(5);
		System.out.println(gelendeger);
		
		

	}
	public static void ilkmetot() {
		System.out.println("Ýlk metot...");
	}
public static int ikincimetot(int sayi) {
	int donecekdeger=sayi*sayi;
	return donecekdeger;
}
}
