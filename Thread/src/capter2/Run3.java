package capter2;

/**
 * 多个变量多个锁
 * @author yhp5210
 *
 */
public class Run3 {

	public static void main(String[] args) {

		HasSelfPrivateNum2 numRef1 = new HasSelfPrivateNum2();
		HasSelfPrivateNum2 numRef2 = new HasSelfPrivateNum2();
		ThreadA2 athread = new ThreadA2(numRef1);
		athread.start();
		ThreadB2 bthread = new ThreadB2(numRef2);
		bthread.start();
	}

}
