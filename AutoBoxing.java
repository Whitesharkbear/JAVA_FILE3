package ch14;

public class AutoBoxing {

	public static void main(String[] args) {
		Object[] arr = new Object[5];
		int i;
		arr[0] = 15;
		arr[1] = 3.445f;
		arr[2] = 'x';
		arr[3] = "abc";
		arr[4] = true;
		for (i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}//13~15�� �迭�� ���� ����ϴµ�, ���⼭�� ���������� ���� ��ü�� ����ϸ�
		//�������� ��µ�����, �ڵ���ڽ��� ó���Ǿ� �⺻ Ÿ���� ���� ���� ���.
	
	}

}
//�ڵ��ڽ�-�⺻ Ÿ���� ��ü�� ��ȯ�ϴ� ���� �����Ϸ��� �ڵ����� ���ִ� ��.
//�ڵ���ڽ�-����Ŭ������ �ڵ����� �⺻ Ÿ������ ��ȯ �ϴ� ��.