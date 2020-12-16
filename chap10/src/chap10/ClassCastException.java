package chap10;

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		if (dog instanceof Dog) {
			System.out.println("h");
		}
		Animal animal = new Cat();
		Dog dog2 = (Dog)animal;
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}