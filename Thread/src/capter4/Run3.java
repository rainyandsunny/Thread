package capter4;

/**
 * Condition.await()ÓÃ·¨
 * @author yhp5210
 *
 */
public class Run3 {

	public static void main(String[] args) {

		MyService3 myService = new MyService3();
		MyThread1 a = new MyThread1(myService);
		a.start();
	}

}
