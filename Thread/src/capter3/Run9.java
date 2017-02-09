package capter3;

/**
 * wait(long time)超过time时间后自动恢复执行
 * @author yhp5210
 *
 */
public class Run9 {

	static private Object lock = new Object();
	static private Runnable runable1 = new Runnable() {
		
		@Override
		public void run() {

			try{
				synchronized (lock) {
					System.out.println("wait begin time="
							+ System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait end time="
							+ System.currentTimeMillis());
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	};
	
	public static void main(String[] args) {
		Thread t = new Thread(runable1);
		t.start();
	}

}
