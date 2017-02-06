package capter2;

/**
 * 实例变量非线程安全
 * @author yhp5210
 *
 */
public class Run1 {

	public static void main(String[] args) {
		HasSelfPrivateNum1 numRef = new HasSelfPrivateNum1();
		ThreadA1 athread = new ThreadA1(numRef);
		athread.start();
		ThreadB1 bthread = new ThreadB1(numRef);
		bthread.start();
	}

}
