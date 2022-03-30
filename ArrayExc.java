package ch15;

public class ArrayExc {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int i;
		for (i = 0; i < 3; i++) {
			arr[i] = i;
		}
		for (i = 0; i < 4; i++) { //예외발생.
			System.out.println(arr[i]);
		}

	}

}
