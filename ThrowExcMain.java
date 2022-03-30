package ch15;

public class ThrowExcMain {

	public static void main(String[] args) {
		ThrowExc te = new ThrowExc();//ThrowExec객체(te)를 생성.
		String str = te.subStr(2);  //subStr()를 호출.하지만 str이
		System.out.println(str); //null이기 때문에 예외가 발생.
	}

}
