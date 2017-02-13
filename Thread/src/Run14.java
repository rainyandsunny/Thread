
/**
 * suspend方法会暂停线程，锁被独占
 * @author yhp5210
 *
 */
public class Run14 {

	public static void main(String[] args) {

		try {
			final SynchronizedObject1 object = new SynchronizedObject1();
			Thread thread1 = new Thread() {

				@Override
				public void run() {
					object.printString();
				}
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread(){
				
				@Override
				public void run(){
					System.out.println("thread2启动了"
							+ "，但进入不了printString方法！"
							+ "只打印一个begin");
					System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了");
					object.printString();
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
