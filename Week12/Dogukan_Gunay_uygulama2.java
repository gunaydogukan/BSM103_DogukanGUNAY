package odev;

import java.util.Scanner;

public class Dogukan_Gunay_uygulama2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Ka� ��renci notu gireceksiniz? ");
int ogrencisayisi=input.nextInt();

System.out.println(ogrencisayisi + " tane ��rencinin notu girilecektir.");
	
for (int i = 1; i <= ogrencisayisi; i++) {
	System.out.print(i + ". ��rencinin vize notunu giriniz : ");
	int vizenotu=input.nextInt();
	
	System.out.print(i + ". ��rencinin final notunu giriniz : ");
	int finalnotu=input.nextInt();
	
System.out.println("��rencinin vize notu: "+vizenotuhesaplama(vizenotu));	
System.out.print("��rencinin final notu: "+finalnotuhesaplama(finalnotu));	
}
	
	

	
	
	
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




