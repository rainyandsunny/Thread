package capter4;

/**
 * 非公平锁示例，运行结果基本上是乱序的，说明先start启动的线程并不代表先获得锁
 * @author yhp5210
 *
 */
public class Run10 {

	public static void main(String[] args) {

		final Service service = new Service(false);
		Runnable runable = new Runnable() {

			@Override
			public void run() {
				System.out.println(" ★线程" + Thread.currentThread().getName()
						+ "运行了");
				service.serviceMethod();
			}
		};

		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}
	}
}
