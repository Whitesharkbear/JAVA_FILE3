package Alsong;

import java.util.Scanner;

class ScanInteger {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		//키보드를 통해 입력한 정숫값을 받는다.
		int x = stdIn.nextInt();  // 입력받은 정숫값을 x에 저장.
		System.out.println(x + "를 입력했습니다.");
	}
}