package ch15;

public class ThrowExcMain {

	public static void main(String[] args) {
		ThrowExc te = new ThrowExc();//ThrowExec��ü(te)�� ����.
		String str = te.subStr(2);  //subStr()�� ȣ��.������ str��
		System.out.println(str); //null�̱� ������ ���ܰ� �߻�.
	}

}
