package ch16;

import java.util.ArrayList;

public class MemberMain {//����Ŭ������ ���α׷����� ����� ����Ʈ�� �����ϰ�
						//���α׷� �޴��� �����Ѵ�.
	public static void main(String[] args) {
		ArrayList<Member> data = new ArrayList<Member>();
		MemberMenu mm = new MemberMenu();
		mm.menuProcess(data);
	}

}
