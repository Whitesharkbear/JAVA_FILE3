package Alsong;

import java.util.Scanner;

class Absolute2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int n = stdIn.nextInt();
		int abs;

		// if (���ǽ�) ���๮ else ���๮
		if (n>=0)
		   abs = n;	// n >=0 �� true�� �� �����Ѵ�.
		else
		   abs = -n;	// n>=0�� false�� �� �����Ѵ�.
		   System.out.println("������ "+ abs + "�Դϴ�.");
		}
	}