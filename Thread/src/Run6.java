
/**
 * throw new InterruptedException���������߳���ʾ
 * @author yhp5210
 *
 */
public class Run6 {

	public static void main(String[] args) {

		try{
			
			MyThread7 thread = new MyThread7();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		}catch(InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
		
	}

}
