package OOP;

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking.");
	}
	void eat(){
		System.out.println(name + " is eating.");

	}
	void sleep(){
		System.out.println(name + " is sleeping.");

	}
}
public class Demo {
	
	public static void main(String[] args){
		Person person1 = new Person();
		person1.name = "Reid";
		person1.email = "redal";
		person1.phone = "2";
		
		person1.walk();
		person1.eat();
		person1.sleep();
	}
	
}
