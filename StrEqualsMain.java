package ch14;

import java.util.Scanner;

public class StrEqualsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id = "test"; //id�� pwd���Ѵ�.
		String pwd = "1234";

		System.out.print("id:");//����ڷκ��� ���̵�� �н����带 �Է¹޴´�
		String id_str = sc.next();

		System.out.print("pwd:");
		String id_pwd = sc.next();

		
		//stringŬ������ equals�� ���ڿ��� ���������� ���Ͽ� ��ҹ��ڸ� ����.
		if (id.equals(id_str) && pwd.equals(id_pwd)) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

		sc.close();
	}

}
