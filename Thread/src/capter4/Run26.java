package capter4;

/**
 * ReentrantReadWriteLock--¶Á¶ÁËø¹²Ïí
 * @author yhp5210
 *
 */
public class Run26 {

	public static void main(String[] args) {

		Service11 service = new Service11();
		ThreadA5 a = new ThreadA5(service);
		a.setName("A");
		ThreadB4 b = new ThreadB4(service);
		b.setName("B");
		a.start();
		b.start();
	}

}
