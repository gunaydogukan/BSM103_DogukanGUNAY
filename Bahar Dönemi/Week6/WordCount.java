package ikinci_week6;

import java.io.*;
import java.util.*;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		countword();
		
	}
	public static void countword() throws FileNotFoundException {
		
	Scanner input = new Scanner(new File("test.txt"));
	
	Set<String> words = new HashSet<String>();
	
	while(input.hasNext()) {
		
		String word=input.next().toLowerCase();
		words.add(word);
	}
	System.out.println("Kelimeler= "+words);
	System.out.println("Kelime say�s� = "+words.size());
	}

}
