package ch14;

import java.util.Scanner;

public class StringBuilderTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int i;
		for (i = 0; i < 3; i++) {
			System.out.println("단어를 입력하라");
			sb.append(sc.next());
		}
		System.out.println(sb);

		sb.delete(3, 5);
		System.out.println(sb);

		sb.insert(3, "xxx");
		System.out.println(sb);

		sb.replace(3, 5, "yyy");
		System.out.println(sb);

		sc.close();
	}

}
