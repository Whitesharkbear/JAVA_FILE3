package ch9;

public class Member4 {
	String name;
	String tel;
	String address;

	Member4(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	Member4 getMember4() {
		return this;
	}

	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}
