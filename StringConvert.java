package ch14;

public class StringConvert {

	public static void main(String[] args) {

		// String 생성 실습
		String str1 = "hello";//8~12문자열의 다양한 생성방법을 보여준다.
		String str2 = new String("java");
		char[] arr = { 'g', 'o', 'o', 'd' };
		String str3 = new String(arr);
		String str4 = new String();
		str4 = str1 + " " + str2 + " " + str3;
		System.out.println(str4);

		// String을 숫자로 변환
		String s_i = "123";
		String s_f = "23.5";
		String s_d = "234.567";
		int i = Integer.valueOf(s_i).intValue();
		float f = Float.valueOf(s_f).floatValue();
		double d = Double.valueOf(s_d).doubleValue();
//20~22숫자형 문자열을 valueOf() 메서드를 이용해 숫자로 변환
//valueOf()는 그 래퍼클래스 객체(Integer이면 Integer 객체)를 반환하므로
//기본 타입으로 변환하는 intValue()로 한번 더 처리해야 한다.		
		System.out.println("String의 합 : " + s_i + s_f + s_d);
//29번줄은 숫자로 변환된 결과 i, f, d를 더하는데, 만약(i+f+d)에서 괄호를 
//생략하면 문자열 연결연산.		
		System.out.println("숫자의 합 : " + (i + f + d));

		int x = Integer.parseInt("123"); //문자열을 숫자로 변환.
		float y = Float.parseFloat("23.5");
		System.out.println("x + y = " + (x + y));

		// 숫자를 String으로 변환
		System.out.println("x + y = " + x + y);
		String str5 = String.valueOf(x);//숫자를 문자열로 변환.
		System.out.println(str5 + 8);//문자열+숫자=>문자열임을 확인.
		System.out.println(8 + str5);//숫자+문자열=>문자열임을 확인

//숫자형 래퍼클래스의 toString()을 이용해 래퍼클래스의 기본타입값을 문자열로 변환		
		String str6 = Integer.toString(i);
		String str7 = Float.toString(f);
		String str8 = Double.toString(d);
		System.out.println("str6 = " + str6);
		System.out.println("str7 = " + str7);
		System.out.println("str8 = " + str8);

	}
}
