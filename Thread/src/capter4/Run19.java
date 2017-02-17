package capter4;

/**
 * lockInterruptibly()�������ǰ�߳�δ���ж�
 * �����ȡ����������Ѿ����жϣ�������쳣
 * @author yhp5210
 *
 */
public class Run19 {

	public static void main(String[] args) {
		
		final MyService9 service = new MyService9();
		Runnable runnableRef = new Runnable(){
			
			@Override
			public void run(){
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
		threadB.interrupt();
		System.out.println("main end!");
	}
	

}
