package capter3;

/**
 * 多个线程等待，然后调用notify,发现只唤醒一个
 * @author yhp5210
 *
 */
public class Run8 {

	public static void main(String[] args) {

		Object lock = new Object();
		ThreadA5 a = new ThreadA5(lock);
		a.start();
		ThreadB3 b = new ThreadB3(lock);
		b.start();
		ThreadC c = new ThreadC(lock);
		c.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//只调用一次，发现只有一个线程被唤醒
		/*NotifyThread1 notifyThread = new NotifyThread1(lock);
		notifyThread.start();*/
		
		//多次调用notify发现全部唤醒
		NotifyThread2 notifyThread = new NotifyThread2(lock);
		notifyThread.start();
	}

}
