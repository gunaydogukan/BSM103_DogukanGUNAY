package odev;

import java.util.Scanner;

public class Dogukan_Gunay_uygulama6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
			String inputstr=input.nextLine();
System.out.println("Bir say� giriniz: ");
int inputInt=input.nextInt();
splitter(inputstr,inputInt);
//bubirdenememesaj�d�r
//3
//bub
//ird
//ene
//mem
//esa
//j�d
	}
public static void splitter(String str , int n ) {
	int index=0;
	for (int i = 0; i < str.length() / n ; i++) {
	System.out.println(str.substring(index,index+n));	
      index+=n;
	}
	System.out.println(str.substring(index ,str.length()));
}
	
	
	
}
