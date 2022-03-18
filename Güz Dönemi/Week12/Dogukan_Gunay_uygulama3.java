package odev;

import java.util.Arrays;
import java.util.Scanner;

public class Dogukan_Gunay_uygulama3 {

	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			System.out.print("Kaç öðrenci notu gireceksiniz? ");
	int ogrencisayisi=input.nextInt();

	System.out.println(ogrencisayisi + " tane öðrencinin notu girilecektir.");
	double[]ortalama= new double[ogrencisayisi];
		
	for (int i = 1; i <= ogrencisayisi; i++) {
		System.out.print(i + ". öðrencinin vize notunu giriniz : ");
		int vizenotu=input.nextInt();
		
		System.out.print(i + ". öðrencinin final notunu giriniz : ");
		int finalnotu=input.nextInt();
		
      ortalama[i-1]=ortalama(vizenotu,finalnotu);
	}
		
		System.out.println("Tüm öðrencilerin geçme puaný");
System.out.println(Arrays.toString(ortalama));
		
		
		
		}
	public static double ortalama(int vizenotu,int finalnotu) {
		vizenotu=(int) vizenotuhesaplama(vizenotu);
		finalnotu=(int) finalnotuhesaplama(finalnotu);
		double ortalama=vizenotu*0.4+finalnotu*0.6;
		return ortalama;
	}
	
	
	
	
	
	
	
	public static double vizenotuhesaplama(int vizenotu) {
	double not = 0.0;
	if (vizenotu>=80) {
	not=vizenotu*1.10;

	}
	else if (vizenotu>=60) {
	not=vizenotu*1.05;	
	}
	if(not>100)
		not=100;

	return not;
	}

	public static double finalnotuhesaplama(int finalnotu) {
		double not = 0.0;
		if (finalnotu>=70) {
			not=finalnotu*1.30;

			}
			else if (finalnotu>=40) {
			not=finalnotu*1.05;	
			}
			if(not>100)
				not=100;

			return not;	
	
	}

}
