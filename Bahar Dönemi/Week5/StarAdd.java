package ikinci_donem;

import java.util.ArrayList;

public class StarAdd {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Kalem");
		words.add("Bilgisayar");
		words.add("Bartýn");
		words.add("Kitap");
		System.out.println("döngü öncesi : "+words);
		System.out.println("Liste uzunluðu: "+words.size());
		for (int index = 0; index < words.size(); index+=2) {
			words.add(index, "*");
		}
		System.out.println("Döngü sonrasý : "+words);
		System.out.println("Liste uzunluðu: "+words.size());

		for (int index = 0; index < words.size(); index++) {
			words.remove(index);
		}
	System.out.println("Silme sonrasý : "+words);
	System.out.println("silme sonrasý liste uzunluðu : "+words.size());
	}

}
