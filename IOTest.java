package ch15;

import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		int ch = 0;
		try {
			while ((ch = System.in.read()) != '\n') {//ǥ���Է�����
//�� ����Ʈ�� �о� ch�� �����ϴµ� �Էµ� ���� '\n'�̸� ������ �ߴ�.�� ������ �����
//�ڵ尡 ���ԵǹǷ� ���� ó���� ���� ������ ������ ���� �����Ƿ� try������ ó��.
//�� �� �����Ϸ��� ���ϴ� ���� ó���� IOException�� ���� ó���̹Ƿ�,
//IOException�� �ƴ� �ٸ� ���ܸ� ó���Ѵٸ� �����ϵ��� ���� ���̴�.
				System.out.println((char) ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//������ �� �޼����� ����ϴ� �޼���.
		}

	}

}
