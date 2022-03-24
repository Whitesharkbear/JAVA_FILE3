package ch9;

public class ThisTest {
	Member4[] arr = new Member4[10];
	int cnt = 0;

	void setMember4(Member4 m) {
		arr[cnt++] = m;
	}

	void print() {
		for (int i = 0; i < cnt; i++) {
			arr[i].print();
			System.out.println("-------------------");
		}
	}
}
