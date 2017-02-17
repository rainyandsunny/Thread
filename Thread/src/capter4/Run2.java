package capter4;

/**
 * 运行程序会报IllegalMonitorStateException，
 * 解决办法是必须在condition.await()方法调用之前调用lock.lock()获得同步监视锁
 * @author yhp5210
 *
 */
public class Run2 {

	public static void main(String[] args) {

		MyService2 service = new MyService2();
		ThreadA1 a = new ThreadA1(service);
		a.start();
	}

}
