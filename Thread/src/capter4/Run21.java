package capter4;

/**
 * tryLock(long timeout,TimeUnit unit)：如果锁在给定等待时间内没有被另一个线程保持 ，且当前线程未被中断，则获取该锁定。
 * 
 * @author yhp5210
 * 
 */
public class Run21 {

	public static void main(String[] args) {

		final MyService11 service = new MyService11();
		Runnable runnableRef = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()
						+ "调用waitMethod时间：" + System.currentTimeMillis());
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}

}
