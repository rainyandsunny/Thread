package capter4;

/**
 * �����������ߣ�һ��һ��
 * @author yhp5210
 *
 */
public class Run7 {

	public static void main(String[] args) {

		MyService7 myService = new MyService7();
		MyThreadA a = new MyThreadA(myService);
		a.start();
		MyThreadB b = new MyThreadB(myService);
		b.start();
	}

}
