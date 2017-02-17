package capter4;

public class Run12 {

	public static void main(String[] args) {

		final Service2 service = new Service2();
		
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				service.serviceMethod1();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i = 0; i < 10; i++){
			threadArray[i] = new Thread(runnable);
		}
		for(int i = 0; i < 10; i++){
			threadArray[i].start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("有线程数：" + service.lock.getQueueLength());
	}

}
