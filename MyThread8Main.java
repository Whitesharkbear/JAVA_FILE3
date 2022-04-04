package ch18;

public class MyThread8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread8 thread1 = new MyThread8();
		MyThread8 thread2 = new MyThread8();
		MyThread8 thread3 = new MyThread8();

		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
