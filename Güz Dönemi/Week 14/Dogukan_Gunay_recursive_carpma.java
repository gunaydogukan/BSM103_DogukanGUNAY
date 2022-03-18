package metot;

import java.util.Scanner;

public class Dogukan_Gunay_recursive_carpma {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Çarpma için sayý giriniz:");
		int sayi1=input.nextInt();
		System.out.print("Çarpma için ikinci sayýyý giriniz:");
		int sayi2=input.nextInt();
		System.out.println(sayi1+"*"+sayi2+"="+r(sayi1, sayi2));
	}
	public static int r(int x , int y ) {

if(y==0) {
	return 0;
}else if (y<0) {
	y=Math.abs(y);
	x=x*(-1);
	if(y==0) {
		
		return 0;
	}
	}
	return x+r(x,y-1);
	}

}
