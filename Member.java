package ch14;

public class Member {
	private String name; //멤버변수 name, tel, address를 갖고
	private String tel; //생성자와 setter, getter로 구성.
	private String address;

	public Member(String name, String tel, String address) {//생성자
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override //39~41번은 toString재정의,멤버변수들의 값을 출력하도록 수정.
	public String toString() {
		return "name=" + name + ", tel=" + tel + ", address=" + address;
	}

}
