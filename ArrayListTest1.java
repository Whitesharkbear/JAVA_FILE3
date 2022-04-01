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
			System.out.println(i + "번째 요소:" + al.get(i));
		}
		System.out.println("검색할 값을 입력하라");
		String srh = sc.next();
		int idx = 0;
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			System.out.println(idx + "위치에서 " + al.get(idx) + " 검색");
		} else {
			System.out.println("찾는 값이 없다.");
		}

		System.out.println("삭제할 값을 입력하라");
		srh = sc.next();
		idx = 0;
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			al.remove(idx);
		} else {
			System.out.println("해당 값이 없다.");
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + "번째 요소:" + al.get(i));
		}

		System.out.println("전체 삭제");
		al.removeAll(al);

		if (al.isEmpty()) {
			System.out.println("리스트가 비었다.");
		} else {
			for (int i = 0; i < al.size(); i++) {
				System.out.println(i + "번째 요소:" + al.get(i));
			}
		}
	}

}
