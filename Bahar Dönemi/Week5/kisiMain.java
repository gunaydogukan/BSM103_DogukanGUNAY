package ikinci_donem;

import java.util.ArrayList;

public class kisiMain {

	public static void main(String[] args) {
		ArrayList<kisi> bireyler = new ArrayList<>();

		bireyler.add(new kisi("Ahmet",24)); 
		bireyler.add(new kisi("Dogukan",20));
		bireyler.add(new kisi("Faruk",19));
		
		bireyler.forEach(birey ->{
			System.out.println("isim :"+birey.get�sim()+", Yas: "+birey.getYas());  //merakl�s� i�in.
		});
		System.out.println("*****");
		for(kisi birey:bireyler) {
			System.out.println("isim :"+birey.get�sim()+", Yas: "+birey.getYas());		}
		
		}

}
