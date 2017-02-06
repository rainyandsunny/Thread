package capter2;

/**
 * 方法内的变量为线程安全
 * @author yhp5210
 *
 */
public class Run {

	public static void main(String[] args) {

		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA athread = new ThreadA(numRef);
		athread.start();
		ThreadB bthread = new ThreadB(numRef);
		bthread.start();
	}

}
