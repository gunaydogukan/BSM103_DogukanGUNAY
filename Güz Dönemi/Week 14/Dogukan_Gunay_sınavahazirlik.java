package uygulama;

import java.util.Iterator;
import java.util.Scanner;

public class Dogukan_Gunay_s�navahazirlik {

	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 System.out.print("Bir say� giriniz: ");
	 int sayi1=input.nextInt();
	 System.out.print("�kinci say�y� giriniz: ");
	 int sayi2=input.nextInt();
	 int ebob = 1;
	 int sonuc2=1;
	 int new1=sayi1;
	 int new2=sayi2;
	 for(int i=2;i<=sayi1&&i<=sayi2;i++) {
		 if((sayi1%i==0) && (sayi2%i==0)) {  //sayi1 veya sayi 2, 0'sa e�er 0 d�nd�r 
			 if((sayi1%i)==(sayi2%i)) {
				 while((sayi1%i==0)&&(sayi2%i==0)) {
					 sayi1=sayi1/i;
					 sayi2=sayi2/i;
					 ebob=i*ebob;
				 }
				
			 }
		 }
	 }
int ekok=0;
	sonuc2=new1*new2;
	for(int k=sonuc2 ; k>=1  ;k--) {
		if((k%new1==0 && k%new2==0)) {
		ekok=k;	
		}
	}
	 
	 
	 System.out.printf(new1+" ve "+new2+" say�lar�n�n\nEbob:"+ebob+" , Ekok:"+ekok);
	
	
	
	
	}

}
