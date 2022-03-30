package ch15;

//MyException클래스는 상위클래스인 Exception클래스를 상속받아야됨.
//이 예외 클래스는 cnt로 크기를 정하여 크기에 맞지 않을때 발생되는
//예외를 만드는 것이다.
public class MyException extends Exception{
	private int cnt;
	
	public MyException(int cnt){//생성자로 크기를 파라메터로 받아 기준
								//크기를 지정할 수 있다.
		 super("크기는 "+cnt+"이상이어야 합니다.");
		 //supper()를 호출하는데, 이는 상위클래스인 Exception클래스의
		 //생성자를 호출하는 것으로 Exception의 생성자중 String하나를
		 //파라메터로 받는 생성자를 호출한다.
		 //Exception은 이 String값을 에러 메세지로 사용.
	}
	
}
