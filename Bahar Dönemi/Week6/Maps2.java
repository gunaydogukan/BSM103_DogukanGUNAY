package ikinci_week6;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class Maps2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Map<String , Integer> wordCount = new HashMap<String , Integer>();
		
		Scanner input=new Scanner(new File("test.txt"));
		
		while(input.hasNext()) {
			String word = input.next().toLowerCase();
			
			if(!wordCount.containsKey(word)) {
				wordCount.put(word, 1);
			}
			else {
				int count = wordCount.get(word);
				wordCount.put(word, count+1);
			}
		}
System.out.println(wordCount);
	}

}
