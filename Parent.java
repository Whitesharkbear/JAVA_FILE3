package ch13;

public abstract class Parent extends GrandParent {
//�ΰ��� �߻�޼��� ��ӹ޾ұ� �������ΰ� ��� �����ؾ� �ϼ��� Ŭ�������ȴ�
	@Override //������ ������̼�.
	public void print() {
		System.out.println("parent");
		System.out.println("name = " + name);
	} //�׷��� print �� ���� ���������Ƿ�
	  //parent�� �߻�Ŭ�����̸�, ��ü�� ���� �� ����.
}
