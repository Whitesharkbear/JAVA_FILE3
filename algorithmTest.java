package ch16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class algorithmTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();//10~13��
		list.add("sd");	//ArrayList�� �����Ͽ� ���ڿ� �� ���� �����Ѵ�.
		list.add("abr");
		list.add("tu");

		System.out.println("����");
		Collections.sort(list);//�޼���� �Ķ���ͷ� ������ ����Ʈ�� ���� ��������������
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {//18~20���ĵ� ����� Ȯ���ϱ� ���� ����Ʈ ��Ҹ� ���
			System.out.println(i.next()); //�̶� Iterator�� ���.
		}

		System.out.println("\n�˻�");
		int idx = -1;
		idx = Collections.binarySearch(list, "abr");//�޼���� �˻��޼���� 
//ù��° �Ķ������ ����Ʈ���� �� ��° �Ķ������ ���� �˻�. �˻� ����� ��ġ���� ��ȯ.
		if (idx < 0) {//26~30�˻� ����� �����̸� ���ٴ� �޽����� ����ϰ�,
			System.out.println("����.");//0�̻��̸� ��ġ�� ���� ����Ѵ�.
		} else {
			System.out.println(idx + "��ġ�� ����Ÿ " + list.get(idx) + "�� �ִ�.");
		}

		System.out.println("\n����(shuffle)");
		Iterator<String> i2 = list.iterator();
		Collections.shuffle(list);//����Ʈ ��Ҹ� ���´�.
		while (i2.hasNext()) {//35~37�� ���� ����� Ȯ���ϱ� ���� ����Ʈ ��Ҹ� ��� ���.
			System.out.println(i2.next());
		}

	}

}
