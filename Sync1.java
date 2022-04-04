package ch18;

public class Sync1 extends Thread {
	private Msg m;

	public Sync1(Msg m) {
		this.m = m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			processMsg(i);
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void processMsg(int i) {
		synchronized (m) {
			try {
				m.writeMsg(getName() + "message[" + i + "]");
				sleep(1);
				m.print();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
