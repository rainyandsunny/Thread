package capter2;

/**
 * ³öÏÖËÀËø
 * @author yhp5210
 *
 */
public class Run25 {

	public static void main(String[] args) {

		Service10 service = new Service10();
		ThreadA22 athread = new ThreadA22(service);
		athread.start();
		ThreadB22 bthread = new ThreadB22(service);
		bthread.start();
	}
}
