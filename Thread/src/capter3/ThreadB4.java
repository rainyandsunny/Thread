package capter3;

public class ThreadB4 extends Thread {

	@Override
	public void run() {

		try {
			ThreadA6 a = new ThreadA6();
			a.start();
			a.join();
			System.out.println("�߳�B��run end����ӡ��");
		} catch (InterruptedException e) {
			System.out.println("�߳�B��catch����ӡ��");
			e.printStackTrace();
		}

	}
}
