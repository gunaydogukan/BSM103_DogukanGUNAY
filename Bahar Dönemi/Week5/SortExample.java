package ikinci_donem;

import java.util.*;

public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Kalem");
		words.add("Bilgisayar");
		words.add("Bart�n");
		words.add("Kitap");
		
		System.out.println("S�ralanmadan �nce : "+words);
        System.out.println(words.get(0));
        Collections.sort(words);
        System.out.println("s�ralanmadan sonra "+words);
	}

}
