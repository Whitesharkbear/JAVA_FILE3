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
			System.out.println("ArrayIndexOutOfBoundsException���ܸ� ó���ϴ� catch��");
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException���ܸ� ó���ϴ� catch��");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("����Ÿ���� ���� Ŭ������ Exception���ܸ� ó���ϴ� catch��");
			e.printStackTrace();
		} finally {
			System.out.println("����ó�� ���� �� ������ ����");
		}

	}
}
