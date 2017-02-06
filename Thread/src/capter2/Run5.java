package capter2;

/**
 	一个线程访问同步方法，另外一个线程可以异步访问该对象非同步方法
 * @author yhp5210
 *
 */
public class Run5 {

	public static void main(String[] args) {

		/**
		 * * 线程A先持有了object对象的锁，
		 * * 但线程B完全可以异步调用非synchronized类型的方法
		 */
		 
		MyObject2 object = new MyObject2();
		ThreadA5 a = new ThreadA5(object);
		a.setName("A");
		ThreadB5 b = new ThreadB5(object);
		b.setName("B");
		a.start();
		b.start();
	}

}
