package ch12;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalAction a = new AnimalAction();
		Dog d = new Dog();
		d.name = "������";
		a.action(d);
		System.out.println("-----------------");

		Cat c = new Cat();
		c.name = "�߿���";
		a.action(c);

	}

}
