package odev;

import java.util.Scanner;

public class Dogukan_Gunay_uygulama4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
System.out.print("Eleman sayýsý giriniz:");
int elemansayisi=input.nextInt();

int dizi[]=new int[elemansayisi];
for (int index = 1; index < dizi.length; index++) {
	System.out.println("Dizinin "+index+" Ýndeksli elemanýný giriniz.");
dizi[index]=input.nextInt();
}
double ortalama = ortalama(dizi);
System.out.println(ortalama);	
	}
public static double ortalama(int[] dizi) {
	double avg=0.0;
	
	int total=0;
	
	for (int indenx = 0; indenx < dizi.length; indenx++) {
    
		total=total+ dizi[indenx];		
   }
	
	avg=(double) total/dizi.length;
	return avg ;
	
	}


}
