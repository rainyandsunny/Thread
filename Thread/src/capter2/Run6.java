package capter2;

/**
 * �����̷߳���ͬһ�����������ͬ���ķ���
 * @author yhp5210
 *
 */
public class Run6 {

	public static void main(String[] args) {

		MyObject3 object = new MyObject3();
		ThreadA6 a = new ThreadA6(object);
		a.setName("A");
		ThreadB6 b = new ThreadB6(object);
		b.setName("B");
		a.start();
		b.start();
	}

}
