package ch12;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalAction a = new AnimalAction();
		Dog d = new Dog();
		d.name = "강아지";
		a.action(d);
		System.out.println("-----------------");

		Cat c = new Cat();
		c.name = "야옹이";
		a.action(c);

	}

}
