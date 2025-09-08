package stackperson;

public class Person {
	String name;
	int age;
	Gender gender;
	
	public Person(String name,int age,Gender gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		}

	void displayPerson() {
		System.out.println("person Name:" +name);
		System.out.println("person Age:" +age);
		System.out.println("person Gender:" +gender);
	}
	
}
