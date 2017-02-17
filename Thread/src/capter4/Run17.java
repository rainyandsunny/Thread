package capter4;

/**
 * isHeldByCurrentThread()的作用是查询当前线程是否保持此锁定
 * @author yhp5210
 *
 */
public class Run17 {

	public static void main(String[] args) {

		final Service7 service1 = new Service7(true);
		Runnable runnable = new Runnable(){
			
			@Override
			public void run(){
				service1.serviceMethod();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
