package uygulama;

public class Cat {
	
	String name;
	int age ;
	String color;
	
	
	public Cat() {
	this.age=0;
	this.color="Renk girilmedi.";
	this.name="Ýsim verilmedi.";
	}
	
	public Cat(String color,int age) {
		this.age=age;
		this.color=color;
	}
	
	public Cat (String color , int age , String name ) {
		this.color=color;
		this.age=age;
		this.name=name;
	}
	
	

}
