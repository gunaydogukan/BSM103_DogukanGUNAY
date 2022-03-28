package uygulama;

public class mainC {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		System.out.println(cat1.age+" , "+ cat1.color+" , "+cat1.name);
		
		Cat cat2 = new Cat("Tarcin",2);
		
		System.out.println(cat2.age+" , "+cat2.color+" , "+cat2.name);
		
		Cat cat3 = new Cat("Gri", 5 , "Tekir");
		System.out.println(cat3.color+" , " +cat3.age+" , "+cat3.name);
		
		Cat cat4 = new Cat("Sarý", 7 , "aaa");
		System.out.println(cat4.color+" , "+cat4.age+" , "+cat4.name);
		
		
		
		
		
		
		

				

	}

}
