package metot;

import java.util.Scanner;

public class Dogukan_Gunay_uygulama1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Ýlk sayýyý giriniz: ");
		int sayi1=input.nextInt();
		System.out.print("Ýkinci sayýyý giriniz: ");
		int sayi2=input.nextInt();
		
		System.out.println(sayi1+"*"+sayi2+"="+carpma(sayi1, sayi2));
		

		
	}	
	public static int carpma(int sayi1 , int sayi2) {
	int sonuc=0;
	if(sayi1==1||sayi2==1) {
		if(sayi1==1) {
			sonuc=sayi2;
		}else
			sonuc=sayi1;
	}else if (sayi1==0||sayi2==0) {
		sonuc=0;
	}
	else {
	
	for(int a=1;a<=sayi2;a++) {
		sonuc+=sayi1;
	}
	}	
		
	return sonuc;
	
}

}
