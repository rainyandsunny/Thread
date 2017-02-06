package capter2;

/**
 * 同步代码块也能实现同步
 * @author yhp5210
 *
 */
public class Run13 {

	public static void main(String[] args) {

		Service2 service = new Service2();
		ThreadA11 a = new ThreadA11(service);
		a.setName("A");
		a.start();
		ThreadB11 b = new ThreadB11(service);
		b.setName("B");
		b.start();
	}

}
