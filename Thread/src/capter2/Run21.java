package capter2;

/**
 * 
 * @author yhp5210
 *
 */
public class Run21 {

	public static void main(String[] args) {

		Service6 service = new Service6();
		ThreadA18 a = new ThreadA18(service);
		a.setName("A");
		a.start();
		ThreadB18 b = new ThreadB18(service);
		b.setName("B");
		b.start();
		ThreadC c = new ThreadC(service);
		c.setName("C");
		c.start();
	}

}
