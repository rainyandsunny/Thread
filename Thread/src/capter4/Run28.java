package capter4;

/**
 * ReentrantReadWriteLock--¶ÁÐ´£¨Ð´¶Á£©»¥³â
 * @author yhp5210
 *
 */
public class Run28 {

	public static void main(String[] args) {

		Service13 service = new Service13();
		ThreadA7 a = new ThreadA7(service);
		a.setName("A");
		a.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadB6 b = new ThreadB6(service);
		b.setName("B");
		b.start();
	}

}
