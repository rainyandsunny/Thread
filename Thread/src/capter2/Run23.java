package capter2;

/**
 * ���ڳ��е�����ͬ�����Ե���b�̲߳������У�string�����ص�ԭ��
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
