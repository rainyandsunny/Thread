package capter3;

/**
 * 证明notify()执行后不立即释放锁，而是等当前同步代码块执行完才释放
 * @author yhp5210
 *
 */
public class Run6 {

	public static void main(String[] args) {

		Object lock = new Object();
		ThreadA3 a = new ThreadA3(lock);
		a.start();
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
		SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
		c.start();
	}

}
