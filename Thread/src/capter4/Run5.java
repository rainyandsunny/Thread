package capter4;

/**
 * signalAll方法：唤醒所有线程
 * @author yhp5210
 *
 */
public class Run5 {

	public static void main(String[] args) {

		MyService5 service = new MyService5();
		ThreadA3 a = new ThreadA3(service);
		a.setName("A");
		a.start();
		ThreadB1 b = new ThreadB1(service);
		b.setName("B");
		b.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.signalAll();
	}

}
