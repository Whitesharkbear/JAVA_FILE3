package ch10;

public class SingleTest {//singleTest의 객체를 static으로 생성.
	private static SingleTest s = new SingleTest();
	private int x;
	private int y;

	private SingleTest() {//생성자를 private으로 지정, 4번 줄처럼
		x = 10;           //클래스 내부에서만 만들고,
		y = 20;           //클래스 밖에서는 못 만든다.
	}

	public static SingleTest getSingleTest() {//4번 줄에서 생성한
		return s;  //객체를 반환, 즉 private 멤버변수 s의 getter.
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {//멤버변수와 동일한 파라미터가 꼭 있어야됨.
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
