package ch18;

public class SleepTestMain {

	public static void main(String[] args) {
		SleepTest thread1 = new SleepTest(1);
		SleepTest thread2 = new SleepTest(2);
		SleepTest thread3 = new SleepTest(3);

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
