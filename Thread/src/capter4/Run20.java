package capter4;

/**
 * tryLock()：仅在调用时锁定未被另一个线程保持的情况下，才获取该锁定。
 * @author yhp5210
 *
 */
public class Run20 {

	public static void main(String[] args) {

		final MyService10 service = new MyService10();
		
		Runnable runnableRef = new Runnable(){
			
			@Override
			public void run(){
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
