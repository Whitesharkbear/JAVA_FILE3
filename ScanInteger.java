package Alsong;

import java.util.Scanner;

class ScanInteger {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		//Ű���带 ���� �Է��� �������� �޴´�.
		int x = stdIn.nextInt();  // �Է¹��� �������� x�� ����.
		System.out.println(x + "�� �Է��߽��ϴ�.");
	}
}