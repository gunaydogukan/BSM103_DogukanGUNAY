package odev;

import java.util.Scanner;

public class Doguakn_Gunay_uygulama5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	System.out.print("Bir kelime giriniz: ");
		String kelime=input.nextLine();
System.out.println("Girilen bir kelime= "+kelime);	
System.out.println("Kelimenin tersten yazılmış hali= "+tersten(kelime));
	
	}
	public static String tersten(String kelime) {
		String ters= "";
	    for (int index = kelime.length(); index > 0; index--) {
			ters += kelime.substring(index-1,index);
//		abc= a0 b-1 c-2   substirng(1,3)=
	    }
	
	
	return ters;
	}

}
