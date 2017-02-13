
/**
 * interrupted + breakÍË³öÏß³Ì
 * @author yhp5210
 *
 */
public class Run4 {

	
	public static void main(String[] args) {
		
		try {
			MyThread5 thread = new MyThread5();
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
