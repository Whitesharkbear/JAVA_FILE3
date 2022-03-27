package ch12;

public class StaticParent {
	protected static String name;//스태틱 멤버변수 name을 선언.
	static {	//static초기화 블럭으로 name을 초기화 한다.
		name = "parent";
	}

	public static void printInfo() {//static메서드로 name출력
		System.out.println("parent");
		System.out.println("name :" + name);
	}
}
