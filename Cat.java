package ch12;

public class Cat extends Animal {

	@Override
	public void cry() {
		super.cry();
		System.out.println("야~옹");
	}

	public void grooming() {
		System.out.println("그루밍한다.");
	}

}
