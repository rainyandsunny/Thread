package capter4;

public class Run15 {

	public static void main(String[] args) {

		final Service5 service = new Service5();
		Runnable runnable = new Runnable(){
			
			@Override
			public void run(){
				service.waitMethod();
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
		service.notifyMethod();
	}

}
