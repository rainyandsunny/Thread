package capter2;

/**
 * a,b�̻߳ύ��ִ�У���Ϊ���е�����ͬ
 * @author yhp5210
 *
 */
public class Run24 {

	public static void main(String[] args) {

		Service9 service = new Service9();
		ThreadA21 a = new ThreadA21(service);
		a.setName("A");
		a.start();
		ThreadB21 b = new ThreadB21(service);
		b.setName("B");
		b.start();
	}

}
