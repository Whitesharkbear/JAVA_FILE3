package ch18;

public class MyThread8 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " , 우선순위 :" + getPriority()
					+ ", message:hello");
		}
		System.out.println(getName() + " stop");
	}

}
