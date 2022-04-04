package ch18;

public class MyThread extends Thread {
	
	@Override
	public void run() {

		for (int i = 0; i < 30; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}

class MyThread2 extends Thread {

	@Override
	public void run() {

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}