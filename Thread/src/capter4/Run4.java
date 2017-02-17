package capter4;

/**
 * signal()≥ı ‘
 * @author yhp5210
 *
 */
public class Run4 {

	public static void main(String[] args) {

		MyService4 service = new MyService4();
		ThreadA2 a = new ThreadA2(service);
		a.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.signal();
	}

}
