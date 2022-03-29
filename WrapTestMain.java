package ch14;

public class WrapTestMain {

	public static void main(String[] args) {
		WrapTest t = new WrapTest();
		
	//new Integer(10) Integer객체를 생성하는 코드로 생성자에 정수 10을
	//전달하여 10을 값으로 갖는 Integer 객체를 생성.
		t.add(new Integer(10));//10~13번 줄은 WrapTest의 add메서드로
		t.add(new Integer(25));//arr배열에 Integer객체와Float객체를 추가
		t.add(new Float(3.56f));
		t.add(new Float(56.123f));
		t.print(); //arr 배열 요소를 출력.
		System.out.println();

		String str1 = "123";//17~18string객체를 선언하여 숫자 문자열을 저장.
		String str2 = "456";//"123"은 숫자로 보이지만 문자열.
		int x = Integer.parseInt(str1);//19~20은 숫자문자열을 실제숫자로 변환
		int y = Integer.parseInt(str2);
		System.out.println("문자열의 합: " + str1 + str2);
		System.out.println("숫자의 합: " + (x + y));
/*	
		Character obj_ch = new Character('a');
		char ch=obj_ch.charValue();
		System.out.println(obj_ch);
		System.out.println(ch);
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.toLowerCase('A'));
	*/} 

}
