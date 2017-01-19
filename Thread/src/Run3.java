
/**
 * isInterrupted的用法
 * 测试线程Thread对象是否已经是中断状态，但不清除状态标志
 * 
 *
 * @author yhp5210
 *
 */
public class Run3 {

	public static void main(String[] args) {

		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止1？="+thread.isInterrupted());
			System.out.println("是否停止2？="+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		
		System.out.println("end!");
	}

}
