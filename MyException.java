package ch15;

//MyExceptionŬ������ ����Ŭ������ ExceptionŬ������ ��ӹ޾ƾߵ�.
//�� ���� Ŭ������ cnt�� ũ�⸦ ���Ͽ� ũ�⿡ ���� ������ �߻��Ǵ�
//���ܸ� ����� ���̴�.
public class MyException extends Exception{
	private int cnt;
	
	public MyException(int cnt){//�����ڷ� ũ�⸦ �Ķ���ͷ� �޾� ����
								//ũ�⸦ ������ �� �ִ�.
		 super("ũ��� "+cnt+"�̻��̾�� �մϴ�.");
		 //supper()�� ȣ���ϴµ�, �̴� ����Ŭ������ ExceptionŬ������
		 //�����ڸ� ȣ���ϴ� ������ Exception�� �������� String�ϳ���
		 //�Ķ���ͷ� �޴� �����ڸ� ȣ���Ѵ�.
		 //Exception�� �� String���� ���� �޼����� ���.
	}
	
}
