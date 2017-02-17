package capter4;

/**
 * hasQueuedThread(Thread thread)的作用是查询指定的线程是否正在等待获取此锁定。
 * hasQueuedThreads()的作用是查询是否有线程正在等待获取此锁定
 * @author yhp5210
 *
 */
public class Run14 {

	public static void main(String[] args) {

		final Service4 service = new Service4();
		Runnable runnable = new Runnable(){
			
			@Override
			public void run(){
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnable);
		threadA.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread threadB = new Thread(runnable);
		threadB.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(service.lock.hasQueuedThread(threadA));
		System.out.println(service.lock.hasQueuedThread(threadB));
		System.out.println(service.lock.hasQueuedThreads());
	}

}
