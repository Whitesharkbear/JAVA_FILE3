package ch12;

public class Cat extends Animal {

	@Override
	public void cry() {
		super.cry();
		System.out.println("��~��");
	}

	public void grooming() {
		System.out.println("�׷���Ѵ�.");
	}

}
