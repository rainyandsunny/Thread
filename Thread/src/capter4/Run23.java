package capter4;

/**
 * awaitUntil()ÓÃ·¨
 * @author yhp5210
 *
 */
public class Run23 {

	public static void main(String[] args) {

		Service10 service = new Service10();
		MyThreadA2 myThreadA = new MyThreadA2(service);
		myThreadA.start();
	}

}
