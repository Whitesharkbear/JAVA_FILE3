package ch3;

public class Op5 {

	public static void main(String[] args) {
		byte a = (byte)0b10001100;	
		byte b = (byte)0b00110000;	
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("~a="+~a);
		System.out.println("a&b="+(a&b));
		System.out.println("a|b="+(a|b));
		System.out.println("a^b="+(a^b));
		System.out.println("a<<3="+(a<<3));
		System.out.println("a>>3="+(a>>3));
		System.out.println("a>>>3="+(a>>>3));

	}

}
