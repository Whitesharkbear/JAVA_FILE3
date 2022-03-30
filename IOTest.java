package ch15;

import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		int ch = 0;
		try {
			while ((ch = System.in.read()) != '\n') {//표준입력으로
//한 바이트씩 읽어 ch에 저장하는데 입력된 값이 '\n'이면 루프를 중단.이 라인은 입출력
//코드가 포함되므로 예외 처리를 하지 않으면 컴파일 되지 않으므로 try블럭으로 처리.
//이 때 컴파일러가 원하는 예외 처리는 IOException에 대한 처리이므로,
//IOException이 아닌 다른 예외를 처리한다면 컴파일되지 않을 것이다.
				System.out.println((char) ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//예외의 상세 메세지를 출력하는 메서드.
		}

	}

}
