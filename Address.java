package Alsong;


//주소를 읽어서 표시
import java.util.Scanner;

class Address {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("주소: ");
		String address = stdIn.nextLine();  //주소

		System.out.println("주소는 " + address + "입니다.");
	}
}