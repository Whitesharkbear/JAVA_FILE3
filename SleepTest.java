package ch18;

public class SleepTest extends Thread {
	private int num;

	public SleepTest(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(num + ",");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
