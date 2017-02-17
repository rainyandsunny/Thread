package capter4;

/**
 * getWaitQueueLength(Condition condition)
 * �����Ƿ��صȴ����������صĸ�������Condition���̹߳�����
 * @author yhp5210
 *
 */
public class Run13 {

	public static void main(String[] args) {
		
		final Service3 service = new Service3();
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
