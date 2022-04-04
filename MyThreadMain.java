package ch18;

public class MyThreadMain {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread3 thread2 = new MyThread3();

		thread1.start();
		thread2.start();

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
