package ch12;

public class StaticParent {
	protected static String name;//����ƽ ������� name�� ����.
	static {	//static�ʱ�ȭ ������ name�� �ʱ�ȭ �Ѵ�.
		name = "parent";
	}

	public static void printInfo() {//static�޼���� name���
		System.out.println("parent");
		System.out.println("name :" + name);
	}
}
