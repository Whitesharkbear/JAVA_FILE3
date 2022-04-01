package ch16;
							//���α׷��� �޴��� ��ϴ� Ŭ������ ����¿�
import java.util.ArrayList; //����� Scanner ��ü, ������� �޴� �Է°��� ������
import java.util.Scanner;   //menu, ���α׷��� �ݺ�, ���Ḧ ������ flag������������´�.

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private int menu;
	boolean flag = true;
	private String menuStr = "1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.�������ʱ�ȭ 7.����";

	public void menuProcess(ArrayList<Member> data) { //12~47�� ���� menu����
		int idx = 0;     //����Ʈ�� �߰�,�˻�,����,����,��ü���,������ �ʱ�ȭ�� ����.
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
				System.out.println("���α׷��� �����մϴ�.");
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է�");
			}
		}
	}

	public Member infoInput() {//49~58���� �߰������ �����ϴ� �޼���� ����ڷκ���
		System.out.print("�̸�:");//name,tel, address�� �Է¹޾� Member��ü��
		String name = sc.next();//�����Ͽ� ��ȯ�Ѵ�. case 1:���� �� �޼��带 ȣ����
		System.out.print("��ȭ��ȣ:");//��ȯ ���� Member��ü�� ����Ʈ�� �߰��Ѵ�.
		String tel = sc.next();
		sc.nextLine();
		System.out.print("�ּ�:");
		String address = sc.nextLine();
		return new Member(name, tel, address);
	}

	public int search(ArrayList<Member> data) {//60~69�� �˻��� ����ϴ� �޼����
		System.out.print("�̸�:");//�̸��� �Է¹޾�, ����Ʈ���� �� �̸��� �ִ� ��ġã�� ��ȯ
		String name = sc.next();//�� ����� �˻��� �ƴ϶� ����,���������� ����, ������ ��������
		for (int i = 0; i < data.size(); i++) {//��ġ�� ã�ƾ� �ϹǷ� ���.
			if (name.equals(data.get(i).getName())) {//case 2:���� search()�� �˻���
				return i;// ��ġ�� ���޹޾�(22)���� 23�� �ٿ���,get()���� ����ġ�� �ִ� ����
			}			 // ������ ���.
		}
		return 0;
	}

	public void editMember(ArrayList<Member> data) {//71~79���� ������ ó���ϴ�
		int idx = search(data);//�޼���� ���� search()�� ȣ���� ������ ��������
		System.out.print("�� ��ȭ��ȣ:");//��ġ�� ã�´�.�׸��� �� �����͸� �Է¹޾� 
		String tel = sc.next(); //set()���� �� ��ġ�� ��ü�� �� Member��ä�� ��ü.
		sc.nextLine();
		System.out.print("�� �ּ�:");
		String address = sc.nextLine();
		data.set(idx, new Member(data.get(idx).getName(), tel, address));
	}

	public void delMember(ArrayList<Member> data) {//81~84���� �޼���� search()��
		int idx = search(data);//ȣ���� ������ �������� ��ġ�� ã��, 
		data.remove(idx);		//remove()�� �����͸� �����Ѵ�.
	}

	public void printMember(Member m) {//86~88���� Member��ü �ϳ��� �Ķ���ͷ�
		System.out.println(m);			//�޾� ����Ѵ�.
	}
}
