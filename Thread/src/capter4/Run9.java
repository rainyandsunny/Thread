package capter4;

/**
 * 公平锁示例，获得锁的时机基本和线程启动的顺序一致
 * @author yhp5210
 *
 */
public class Run9 {

	public static void main(String[] args) {

		final Service service = new Service(true);
		Runnable runnable = new Runnable(){
			
			@Override
			public void run(){
				System.out.println(" ★线程" + Thread.currentThread().getName()
						+ "运行了 ");
				service.serviceMethod();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i = 0; i < 10; i++){
			threadArray[i] = new Thread(runnable);
		}
		for(int i = 0; i < 10; i++){
			threadArray[i].start();
		}
	}

}
