package capter2;

/**
 * ��synchronized�ؼ��������ķ���һ�����Ŷ����е�
 * @author yhp5210
 *
 */
public class Run4 {

	public static void main(String[] args) {

		MyObject1 object = new MyObject1();
		ThreadA4 a = new ThreadA4(object);
		a.setName("A");
		ThreadB4 b = new ThreadB4(object);
		b.setName("B");
		a.start();
		b.start();
	}

}
