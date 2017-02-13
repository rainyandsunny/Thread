package capter3;

public class ThreadB4 extends Thread {

	@Override
	public void run() {

		try {
			ThreadA6 a = new ThreadA6();
			a.start();
			a.join();
			System.out.println("线程B在run end出打印了");
		} catch (InterruptedException e) {
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}

	}
}
