package capter3;

public class Run21 {

	public static void main(String[] args) {

		try {

			ThreadB5 b = new ThreadB5();
			ThreadA8 a = new ThreadA8(b);
			a.start();
			Thread.sleep(1000);
			ThreadC4 c = new ThreadC4(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
