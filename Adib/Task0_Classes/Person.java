package Task0_Classes;

public class Person {// 2 arguments
	String name;
	int age;

	Person() {// constructors without parameters
		this.name = "No name";
		this.age = -1;
		/**
		 * i have used THIS because it is a good programming practice
		 */

	}

	Person(String name) {
		this.name = name;

	}

	Person(String name, int age) {
		this.name = name;

		this.age = age;

	}

	void printtext() {
		System.out.println("Hello, I am " + name + " I am " + age + " years old");

	}

	public static void main(String[] args) {
		Person Pesho = new Person();// creating an object
		System.out.println(Pesho.name + " " + Pesho.age);
		Person pesho = new Person("pesho");// creating another object
		System.out.println(pesho.name + " " + pesho.age);
		Person georgi = new Person("Georgi", 18);
		System.out.println(georgi.name + " " + georgi.age);
		Pesho.printtext();
		pesho.printtext();
		georgi.printtext();

	}

}
