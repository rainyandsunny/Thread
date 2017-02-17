package capter4;

/**
 * 在等待时间到达前，可以被其他线程提前唤醒
 * @author yhp5210
 *
 */
public class Run24 {

	public static void main(String[] args) {

		Service10 service = new Service10();
		MyThreadA2 myThreadA = new MyThreadA2(service);
		myThreadA.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadB3 myThreadB = new ThreadB3(service);
		myThreadB.start();
	}

}
