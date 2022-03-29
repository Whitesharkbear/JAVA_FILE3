package ch14;

public class Member {
	private String name; //������� name, tel, address�� ����
	private String tel; //�����ڿ� setter, getter�� ����.
	private String address;

	public Member(String name, String tel, String address) {//������
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

	@Override //39~41���� toString������,����������� ���� ����ϵ��� ����.
	public String toString() {
		return "name=" + name + ", tel=" + tel + ", address=" + address;
	}

}
