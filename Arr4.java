package ch5;

import java.util.Scanner;

public class Arr4 {

	public static void main(String[] args) {
		int i, num;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("�˻��� ���ڸ� �Է��Ͻÿ�.");
		num = sc.nextInt();
		for (i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				flag = true;
				System.out.println("�ε��� " + i + " ���� �˻�");
				break;
			}
		}
		if (!flag) {
			System.out.println("ã�� ���� ����.");
		}
		sc.close();
	}

}
