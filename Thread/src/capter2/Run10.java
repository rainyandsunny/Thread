package capter2;

/**
 * �����쳣�����Զ��ͷ�
 * @author yhp5210
 *
 */
public class Run10 {

	public static void main(String[] args) {

		try {
			Service1 service = new Service1();
			ThreadA8 a = new ThreadA8(service);
			a.setName("a");
			a.start();
			Thread.sleep(500);
			ThreadB8 b = new ThreadB8(service);
			b.setName("b");
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
