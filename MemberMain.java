package ch16;

import java.util.ArrayList;

public class MemberMain {//메인클래스로 프로그램에서 사용할 리스트를 생성하고
						//프로그램 메뉴를 시작한다.
	public static void main(String[] args) {
		ArrayList<Member> data = new ArrayList<Member>();
		MemberMenu mm = new MemberMenu();
		mm.menuProcess(data);
	}

}
