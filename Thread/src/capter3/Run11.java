package capter3;

/**
 * 一个生产者对应一个消费者
 * @author yhp5210
 *
 */
public class Run11 {

	public static void main(String[] args) {

		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);
		ThreadP pThread = new ThreadP(p);
		ThreadC1 rThread = new ThreadC1(r);
		rThread.start();
		pThread.start();
	}

}
