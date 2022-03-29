package ch14;

public class WrapTest {
	public Object[] arr = new Object[10];//objectŸ���� �迭�� ����
	//object�� ��� Ŭ������ ���� Ŭ�����̹Ƿ� ��� Ŭ������ ��ü�� 
	//��ĳ�����Ͽ� �̹迭�� ������ �� �ִ�.
	public int cnt; //�迭�� ����Ǵ� �������� ������ ī��Ʈ �� ����.

	public void add(Object obj) {//arr�迭�� object��ü�� �߰��Ѵ�.
		arr[cnt++] = obj;
	}

	public void print() {//arr�迭�� ����� �����͸� ����Ѵ�.
		int i;
		for (i = 0; i < cnt; i++) {
			Object o = arr[i];//�迭���� ��ü�� �ϳ��� ���� ��ü o������
			if (o instanceof Integer) {//������ü�� Integer�� ��ü���� Ȯ��
				System.out.println(((Integer) o).intValue());
			} else if (o instanceof Float) {//������ü�� Float���̸�
				System.out.println(((Float) o).floatValue());
				//floatValue()�޼���� Float��ü�� float�� �⺻Ÿ������ ��ȯ.
			}
		}
	}
}
