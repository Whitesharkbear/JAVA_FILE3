package ch15;

import java.util.Scanner;

public class MyExceptionMain {

	public static void main(String[] args) {
		int cnt = 0;
		int[] arr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ũ�⸦ �Է��϶�");
		cnt = sc.nextInt();//ũ�⸦ �Է¹޴´�.�����α׷������� ����
		if (cnt < 5) { //ũ�⸦ 5�� ���, 5���� ���� ���� �ԷµǸ�
			try { //���ܸ� �߻�. cnt�� 5���� �������� ���Ͽ� �����ϸ�
//MyException�� �߻�.5�̻��� ���� �ԷµǸ� ����ó���Ǿ� 25~28�ٿ�����				
				throw new MyException(5); //�Է��� ũ�� �迭����
				
			} catch (MyException e) {
				// TODO Auto-generated catch block

				e.printStackTrace();//������ �󼼸޼����� ����ϴ� �޼���
			}finally{	//22~24�� ���� finally������� �� �����
				sc.close();  //��ĳ�ʸ� �ݴ´�.���� finally ����� ���ٸ�
//�߰��� ���� �߻����� ���α׷��� �ߴܵǸ� close()�� ������ �� ����
//�̴� �ٸ� ���α׷��� �ڿ��� ����� �� ���� �����.
			}
		} else {
			System.out.println("ũ�Ⱑ " + cnt + "�� �迭�� ����������ϴ�.");
			arr = new int[cnt];
		}
		sc.close();
	}

}
