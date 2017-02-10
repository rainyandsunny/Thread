package capter3;

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
