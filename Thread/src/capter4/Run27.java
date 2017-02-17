package capter4;

/**
 * ReentrantReadWriteLockµÄÊ¹ÓÃ£ºÐ´Ð´»¥³â
 * @author yhp5210
 *
 */
public class Run27 {

	public static void main(String[] args) {

		Service12 service = new Service12();
		ThreadA6 a = new ThreadA6(service);
		a.setName("A");
		ThreadB5 b = new ThreadB5(service);
		b.setName("B");
		a.start();
		b.start();
	}

}
