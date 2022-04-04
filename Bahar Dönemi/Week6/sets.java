package ikinci_week6;

import java.util.*;

public class sets {

	public static void main(String[] args) {
		
	ArrayList<String> lists = new ArrayList<String>();
	
	lists.add("Kalem");
	lists.add("Masa");
	lists.add("Bilgisayar");
	lists.add("Defter");
	lists.add(3,"Dolap");
	lists.add("Kalem");
	lists.add("Masa");
	
	System.out.println(lists);
	System.out.println(lists.size());
	// treeset hashset
	Set<String> sets= new HashSet<String>();
	
	
	sets.add("Kalem");
	sets.add("Masa");
	sets.add("Bilgisayar");
	sets.add("Defter");
	//sets.add("Dolap");
	sets.add("Kalem");
	sets.add("Masa");
	
	System.out.println(sets);
	System.out.println(sets.size());
	System.out.println(sets.contains("Dolap"));
	
	sets.clear();
	System.out.println(sets);
	sets.addAll(lists);
	System.out.println(sets);
	System.out.println(lists.get(2));
	
	

	}

}
