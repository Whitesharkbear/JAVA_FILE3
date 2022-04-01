package ch16;
							//프로그램의 메뉴를 운영하는 클래스로 입출력에
import java.util.ArrayList; //사용할 Scanner 객체, 사용자의 메뉴 입력값을 저장할
import java.util.Scanner;   //menu, 프로그램의 반복, 종료를 제어할 flag멤버변수를갖는다.

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private int menu;
	boolean flag = true;
	private String menuStr = "1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.데이터초기화 7.종료";

	public void menuProcess(ArrayList<Member> data) { //12~47번 줄은 menu값에
		int idx = 0;     //리스트에 추가,검색,수정,삭제,전체출력,데이터 초기화를 수행.
		while (flag) {
			System.out.println(menuStr);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				data.add(infoInput());
				break;
			case 2:
				idx = search(data);
				printMember(data.get(idx));
				break;
			case 3:
				editMember(data);
				break;
			case 4:
				delMember(data);
				break;
			case 5:
				for (idx = 0; idx < data.size(); idx++) {
					printMember(data.get(idx));
				}
				break;
			case 6:
				data.removeAll(data);
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

	public Member infoInput() {//49~58줄은 추가기능을 수행하는 메서드로 사용자로부터
		System.out.print("이름:");//name,tel, address를 입력받아 Member객체를
		String name = sc.next();//생성하여 반환한다. case 1:에서 이 메서드를 호출해
		System.out.print("전화번호:");//반환 받은 Member객체를 리스트에 추가한다.
		String tel = sc.next();
		sc.nextLine();
		System.out.print("주소:");
		String address = sc.nextLine();
		return new Member(name, tel, address);
	}

	public int search(ArrayList<Member> data) {//60~69는 검색을 담당하는 메서드로
		System.out.print("이름:");//이름을 입력받아, 리스트에서 그 이름이 있는 위치찾아 반환
		String name = sc.next();//이 기능은 검색뿐 아니라 수정,삭제에서도 수정, 삭제할 데이터의
		for (int i = 0; i < data.size(); i++) {//위치를 찾아야 하므로 사용.
			if (name.equals(data.get(i).getName())) {//case 2:에서 search()로 검색한
				return i;// 위치를 전달받아(22)오고 23번 줄에서,get()으로 그위치에 있는 값을
			}			 // 꺼내어 출력.
		}
		return 0;
	}

	public void editMember(ArrayList<Member> data) {//71~79줄은 수정을 처리하는
		int idx = search(data);//메서드로 먼저 search()를 호출해 수정할 데이터의
		System.out.print("새 전화번호:");//위치를 찾는다.그리고 새 데이터를 입력받아 
		String tel = sc.next(); //set()으로 그 위치의 객체를 새 Member객채로 교체.
		sc.nextLine();
		System.out.print("새 주소:");
		String address = sc.nextLine();
		data.set(idx, new Member(data.get(idx).getName(), tel, address));
	}

	public void delMember(ArrayList<Member> data) {//81~84삭제 메서드로 search()를
		int idx = search(data);//호출해 사제할 데이터의 위치를 찾고, 
		data.remove(idx);		//remove()로 데이터를 제거한다.
	}

	public void printMember(Member m) {//86~88줄은 Member객체 하나를 파라메터로
		System.out.println(m);			//받아 출력한다.
	}
}
