package ch15;

import java.util.Scanner;

public class MyExceptionMain {

	public static void main(String[] args) {
		int cnt = 0;
		int[] arr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 크기를 입력하라");
		cnt = sc.nextInt();//크기를 입력받는다.이프로그램에서는 기준
		if (cnt < 5) { //크기를 5로 잡고, 5보다 작은 값이 입력되면
			try { //예외를 발생. cnt가 5보다 작은지를 비교하여 만족하면
//MyException을 발생.5이상인 값이 입력되면 정상처리되어 25~28줄에의해				
				throw new MyException(5); //입력한 크기 배열생성
				
			} catch (MyException e) {
				// TODO Auto-generated catch block

				e.printStackTrace();//에러의 상세메세지를 출력하는 메서드
			}finally{	//22~24번 줄은 finally블록으로 다 사용한
				sc.close();  //스캐너를 닫는다.만약 finally 블록이 없다면
//중간에 예외 발생으로 프로그램이 중단되면 close()를 실행할 수 없고
//이는 다른 프로그램이 자원을 사용할 수 없게 만든다.
			}
		} else {
			System.out.println("크기가 " + cnt + "인 배열이 만들어졌습니다.");
			arr = new int[cnt];
		}
		sc.close();
	}

}
