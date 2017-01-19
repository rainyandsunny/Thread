
/**
 * suspend ÔÝÍ£Ïß³Ì
 * @author yhp5210
 *
 */
public class Run13 {
	
	public static void main(String[] args){
		
		try {
			MyThread14 thread = new MyThread14();
			thread.start();
			Thread.sleep(5000);
			//A¶Î
			thread.suspend();
			System.out.println("A=" + System.currentTimeMillis()+" "
					+ thread.getI());
			Thread.sleep(5000);
			System.out.println("A=" + System.currentTimeMillis()+" "
					+ thread.getI());
			//B¶Î
			thread.suspend();
			Thread.sleep(5000);
			//C¶Î
			thread.suspend();
			System.out.println("B=" + System.currentTimeMillis()+" "
					+ thread.getI());
			Thread.sleep(5000);
			System.out.println("B=" + System.currentTimeMillis()+" "
					+ thread.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
