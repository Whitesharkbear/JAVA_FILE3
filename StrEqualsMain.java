package ch14;

import java.util.Scanner;

public class StrEqualsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id = "test"; //id와 pwd정한다.
		String pwd = "1234";

		System.out.print("id:");//사용자로부터 아이디와 패스워드를 입력받는다
		String id_str = sc.next();

		System.out.print("pwd:");
		String id_pwd = sc.next();

		
		//string클래스의 equals는 문자열이 동일한지를 비교하여 대소문자를 구분.
		if (id.equals(id_str) && pwd.equals(id_pwd)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		sc.close();
	}

}
