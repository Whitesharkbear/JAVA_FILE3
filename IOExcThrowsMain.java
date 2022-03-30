package ch15;

import java.io.IOException;

public class IOExcThrowsMain {

	public static void main(String[] args) {
		IOExcThrows io = new IOExcThrows();
		try { //IOExecThrows의 객체를 생성.
			io.input(); //input 메서드 호출.
		} catch (IOException e) {
			e.printStackTrace(); //에러의 상세 메세지를 출력하는 메서드.
		}
		io.print();

	}

}
