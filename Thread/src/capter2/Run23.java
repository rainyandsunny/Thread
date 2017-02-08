package capter2;

/**
 * 由于持有的锁相同，所以导致b线程不能运行（string常量池的原因）
 * @author yhp5210
 *
 */
public class Run23 {

	public static void main(String[] args) {

		Service8 service = new Service8();
		ThreadA20 a = new ThreadA20(service);
		a.setName("A");
		a.start();
		ThreadB20 b = new ThreadB20(service);
		b.setName("B");
		b.start();
	}

}
