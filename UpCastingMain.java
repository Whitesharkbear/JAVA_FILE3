package ch12;

public class UpCastingMain {

	public static void main(String[] args) {
		System.out.println("UpCastingParent�� ��ü");
		UpCastingParent up = new UpCastingParent();
		System.out.println("up.add()=" + up.add() + "\n");

		System.out.println("UpCastingChild ��ü");
		UpCastingChild uc = new UpCastingChild();
		System.out.println("uc.add()=" + uc.add());
		System.out.println("uc.sub()=" + uc.sub() + "\n");

		System.out.println("UpCasting�� ��ü");
		UpCastingParent upc = new UpCastingChild();
//��ĳ���� ��ü�� ����, Ÿ���� �θ�Ŭ������ UpcastingParent�̰�
//������ ȣ���� �ڽ�Ŭ������ UpcastingChild�� ���� ȣ��.
		System.out.println("upc.add()=" + upc.add() + "\n");
		// System.out.println("upc.sub()="+up.sub());
		//sub()ȣ���ϴµ�, upc�� Ÿ���� UpcastingParent�̹Ƿ�
		//��Ŭ�������� sub()�� ���ǵ��� �ʾҴ�.�׷��� ���� �߻�
		//��ó�� Ÿ���� �θ�, ����Ǵ� ���´� �ڽ��ΰ��� ��ĳ�����̶�� ��
	}

}
