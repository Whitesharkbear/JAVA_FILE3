package Alsong;

import java.util.Scanner;
class Absolute1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int n = stdIn.nextInt();

		// if (���ǽ�) ���๮ else ���๮
		if (n>=0)
		   // n >=0 �� true�� �� �����Ѵ�.
		   System.out.println("������ "+ n + "�Դϴ�.");
		else
		   // n>=0�� false�� �� �����Ѵ�.
		   System.out.println("������ "+ n + "�Դϴ�.");
		}
	}