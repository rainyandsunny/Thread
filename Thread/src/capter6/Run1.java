package capter6;

/**
 * ÀÁººÄ£Ê½
 * @author yhp5210
 *
 */
public class Run1 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
