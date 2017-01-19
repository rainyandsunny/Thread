/**
 * break + interrupted退出线程的弊端
 * @author yhp5210
 *
 */
public class Run5 {

	public static void main(String[] args) {

		try {
			MyThread6 thread = new MyThread6();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("main catch");
		}
		System.out.println("end!");

	}

}
