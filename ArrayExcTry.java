package ch15;

public class ArrayExcTry {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int i;
		String str = null;
		try {
			for (i = 0; i < 3; i++) {
				arr[i] = i;
			}
			for (i = 0; i < 3; i++) {
				System.out.println(arr[i]);
			}
			i = 4 / 3;
			str.charAt(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException예외를 처리하는 catch문");
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException예외를 처리하는 catch문");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("예외타입의 상위 클래스인 Exception예외를 처리하는 catch문");
			e.printStackTrace();
		} finally {
			System.out.println("예외처리 종료 시 무조건 실행");
		}

	}
}
