package ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add(1, "ccc");
		al.set(2, "fff");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + "��° ���:" + al.get(i));
		}
		System.out.println("�˻��� ���� �Է��϶�");
		String srh = sc.next();
		int idx = 0;
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			System.out.println(idx + "��ġ���� " + al.get(idx) + " �˻�");
		} else {
			System.out.println("ã�� ���� ����.");
		}

		System.out.println("������ ���� �Է��϶�");
		srh = sc.next();
		idx = 0;
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			al.remove(idx);
		} else {
			System.out.println("�ش� ���� ����.");
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + "��° ���:" + al.get(i));
		}

		System.out.println("��ü ����");
		al.removeAll(al);

		if (al.isEmpty()) {
			System.out.println("����Ʈ�� �����.");
		} else {
			for (int i = 0; i < al.size(); i++) {
				System.out.println(i + "��° ���:" + al.get(i));
			}
		}
	}

}
