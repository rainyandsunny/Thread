package capter2;

/**
 	һ���̷߳���ͬ������������һ���߳̿����첽���ʸö����ͬ������
 * @author yhp5210
 *
 */
public class Run5 {

	public static void main(String[] args) {

		/**
		 * * �߳�A�ȳ�����object���������
		 * * ���߳�B��ȫ�����첽���÷�synchronized���͵ķ���
		 */
		 
		MyObject2 object = new MyObject2();
		ThreadA5 a = new ThreadA5(object);
		a.setName("A");
		ThreadB5 b = new ThreadB5(object);
		b.setName("B");
		a.start();
		b.start();
	}

}
