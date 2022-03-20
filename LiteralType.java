package ch3;

public class LiteralType {

	public static void main(String[] args) {
		boolean a = true;
		byte b = 10;				//int 리터럴
		short c = 20;				//int 리터럴
		int d = 30;					//int 리터럴
		long e = 40L;				//long 리터럴		
		float f = 12.5f;			//float 리터럴
		double g = 34.56;			//double 리터럴
		char h = 'k';				//char 리터럴
		String i = "hello java^^";	//String 리터럴
		
		System.out.println("boolean : "+a);
		System.out.println("byte : "+b);
		System.out.println("short : "+c);
		System.out.println("int : "+d);
		System.out.println("long : "+e);
		System.out.println("float : "+f);
		System.out.println("double : "+g);
		System.out.println("char : "+h);
		System.out.println("String : "+i);
		
		//이스케이프 문자 출력
		System.out.println("이스케이프 문자 출력");
		System.out.println("1. abcdefg\bhijklmn");
		System.out.println("2. abcdefg\thijklmn");
		System.out.println("3. abcdefg\nhijklmn");
		System.out.println("4. abcdefg\fhijklmn");
		System.out.println("5. abcdefg\rhijklmn");
		System.out.println("6. abcdefg\"hijklmn");
		System.out.println("7. abcdefg\'hijklmn");
		System.out.println("8. abcdefg\\hijklmn");

	}

}
