package capter3;

/**
 * 通过死循环的方式来进行线程间通信
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
