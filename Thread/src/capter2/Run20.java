package capter2;

/**
 * ��̬ͬ��synchronized������synchronized(class)�����
 * @author yhp5210
 *
 */
public class Run20 {

	public static void main(String[] args) {

		ThreadA17 a = new ThreadA17();
		a.setName("A");
		a.start();
		ThreadB17 b = new ThreadB17();
		b.setName("B");
		b.start();
	}

}
