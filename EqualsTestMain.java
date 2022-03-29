package ch14;

public class EqualsTestMain {

	public static void main(String[] args) {
		EqualsTest e1 = new EqualsTest();
		EqualsTest e2 = new EqualsTest();
		e1.x = 1;
		e2.x = 1;
		System.out.println(e1.equals(e2));
	}

}
