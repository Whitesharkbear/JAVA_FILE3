package ch15;

import java.io.IOException;

public class IOExcThrowsMain {

	public static void main(String[] args) {
		IOExcThrows io = new IOExcThrows();
		try { //IOExecThrows�� ��ü�� ����.
			io.input(); //input �޼��� ȣ��.
		} catch (IOException e) {
			e.printStackTrace(); //������ �� �޼����� ����ϴ� �޼���.
		}
		io.print();

	}

}
