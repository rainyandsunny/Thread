package capter4;

/**
 * isLocked()的作用是查询此锁定是否由任意线程保持
 * @author yhp5210
 *
 */
public class Run18 {

	public static void main(String[] args) {

		final Service8 service1 = new Service8(true);
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
