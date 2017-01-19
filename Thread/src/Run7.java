
/**
 * 线程先sleep再停止会出现异常：java.lang.InterruptedException: sleep interrupted
 * @author yhp5210
 *
 */
public class Run7 {

	public static void main(String[] args) {

		
		try {
			MyThread8 thread = new MyThread8();
			thread.start();
			Thread.sleep(200);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("main catch");
		}
		System.out.println("end!");
		
	}

}
