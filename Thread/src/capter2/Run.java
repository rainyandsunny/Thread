package capter2;

/**
 * �����ڵı���Ϊ�̰߳�ȫ
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
