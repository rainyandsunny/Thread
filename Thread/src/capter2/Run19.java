package capter2;

/**
 * synchronized(x),�������߳�ִ��x������synchronizedͬ������ʱ��ͬ��Ч��
 * @author yhp5210
 *
 */
public class Run19 {

	public static void main(String[] args) {

		Service5 service = new Service5();
		MyObject4 object = new MyObject4();
		ThreadA16 a = new ThreadA16(service, object);
		a.setName("a");
		a.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadB16 b = new ThreadB16(service, object);
		b.setName("b");
		b.start();
	}

}
