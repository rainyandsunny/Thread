package capter3;

/**
 * ͨ����ѭ���ķ�ʽ�������̼߳�ͨ��
 * @author yhp5210
 *
 */
public class Run {

	public static void main(String[] args) {

		MyList service = new MyList();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}

}
