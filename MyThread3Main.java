package ch18;

public class MyThread3Main {

	public static void main(String[] args) {
		MyThread3 thread1 = new MyThread3();
		MyThread3 thread2 = new MyThread3();
		MyThread3 thread3 = new MyThread3();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
