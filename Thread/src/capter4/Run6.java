package capter4;

/**
 * Condition唤醒指定线程
 * @author yhp5210
 *
 */
public class Run6 {

	public static void main(String[] args) {

		MyService6 service = new MyService6();
		ThreadA4 a = new ThreadA4(service);
		a.setName("A");
		a.start();
		ThreadB2 b = new ThreadB2(service);
		b.setName("B");
		b.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.signalAll_A();
	}

}
