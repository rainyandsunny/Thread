package capter2;

/**
 * �����������ͬ�������첽����
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
