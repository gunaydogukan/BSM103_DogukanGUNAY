package ikinci_week6;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		
		Map<Integer , String> citys = new TreeMap<Integer , String>();
         //<key ,      value >
		
		citys.put(34, "�stanbul");
		citys.put(06, "Ankara");
		citys.put(35, "�zmir");
		citys.put(66, "Yozgat");
	
	
		System.out.println(citys);
		System.out.println("�ndeksler - keys ; "+citys.keySet());
		System.out.println(citys.values());
		
		Map<Integer , Set<String>> citys2= new HashMap<Integer , Set<String>>();
		
		citys2.put(34, new TreeSet<String>());
		citys2.get(34).add("�stanbul");
		citys2.get(34).add("Be�ikta�");
		citys2.get(34).add("Kad�k�y");
		
		citys2.put(6, new TreeSet<String>());
		citys2.get(6).add("Ankara");
		citys2.get(6).add("Cankaya");
		citys2.get(6).add("K�z�lay");
		
		System.out.println(citys2);
		
	}

}
