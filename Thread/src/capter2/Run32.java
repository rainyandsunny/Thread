package capter2;
/**
 * ����Ȼ�仯�ˣ�����ȡ������ʱ��������ͬ��
 * @author yhp5210
 *
 */
public class Run32 {

	public static void main(String[] args) {

		MyService1 service = new MyService1();
		ThreadA23 a = new ThreadA23(service);
		a.setName("A");
		ThreadB23 b = new ThreadB23(service);
		b.setName("B");
		a.start();
		b.start();
	}

}
