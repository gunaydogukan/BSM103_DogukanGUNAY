package ikinci_donem;

import java.util.ArrayList;

public class StarAdd {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Kalem");
		words.add("Bilgisayar");
		words.add("Bart�n");
		words.add("Kitap");
		System.out.println("d�ng� �ncesi : "+words);
		System.out.println("Liste uzunlu�u: "+words.size());
		for (int index = 0; index < words.size(); index+=2) {
			words.add(index, "*");
		}
		System.out.println("D�ng� sonras� : "+words);
		System.out.println("Liste uzunlu�u: "+words.size());

		for (int index = 0; index < words.size(); index++) {
			words.remove(index);
		}
	System.out.println("Silme sonras� : "+words);
	System.out.println("silme sonras� liste uzunlu�u : "+words.size());
	}

}
