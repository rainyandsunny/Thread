
/**
 * interrupt加return来停止线程
 * @author yhp5210
 *
 */
public class Run12 {

	public static void main(String[] args){
		MyThread13 thread = new MyThread13();
		thread.start();
		try {
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
