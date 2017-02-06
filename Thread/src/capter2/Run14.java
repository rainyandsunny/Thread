package capter2;

/**
 * 对象监视器不同，所以异步运行
 * @author yhp5210
 *
 */
public class Run14 {

	public static void main(String[] args) {

		Service3 service = new Service3();
		ThreadA12 a = new ThreadA12(service);
		a.setName("A");
		a.start();
		ThreadB12 b = new ThreadB12(service);
		b.setName("B");
		b.start();
				
	}

}
