package capter7;

/**
 * sleep的时候状态为TIMED_WAITING
 * @author yhp5210
 *
 */
public class Run1 {

	public static void main(String[] args) {

		MyThread1 t = new MyThread1();
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main方法中的状态" + t.getState());
	}

}
