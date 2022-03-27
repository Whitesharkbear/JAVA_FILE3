package ch12;

public class StaticMain {

	public static void main(String[] args) {
		StaticParent sp = new StaticParent();
		sp.name = "static parent";
		sp.printInfo();
		System.out.println("----------------");

		StaticChild sc = new StaticChild();
		sc.name = "static chlid";
		sc.setAge(10);
		sc.printInfo();
		System.out.println("----------------");

		StaticParent spc = new StaticChild();//업캐스팅으로객체생성
		spc.name = "UpCasting";
		spc.printInfo();
		//StaticChild c = (StaticChild) spc;
		//c.setAge(20);
		//c.printInfo();
	}

}
