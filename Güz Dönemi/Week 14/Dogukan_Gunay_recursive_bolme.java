package metot;

import java.util.Scanner;

public class Dogukan_Gunay_recursive_bolme {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);

System.out.print("Bölme için ilk sayýyý gir:");
int sayi1=input.nextInt();
System.out.print("Bölme için ikinci sayýyý gir:");
int sayi2=input.nextInt();

System.out.println(sayi1+"/"+sayi2+"="+r(sayi1, sayi2));
		}
public static int r(int x , int y ) {
if(x==0) {
	return 0 ;
}else if (x-y==0)  {
	return 1 ;
}else if (x-y<0) {
	return 0;
	}


return 1+r(x-y, y);

}

}
