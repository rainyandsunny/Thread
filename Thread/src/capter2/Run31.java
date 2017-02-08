package capter2;

public class Run31 {

	public static void main(String[] args) {

		MyService1 service = new MyService1();
		ThreadA23 a = new ThreadA23(service);
		a.setName("A");
		ThreadB23 b = new ThreadB23(service);
		b.setName("B");
		a.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.start();
	}

}
