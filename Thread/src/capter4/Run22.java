package capter4;

/**
 * awaitUninterruptibly()สนำร
 * @author yhp5210
 *
 */
public class Run22 {

	public static void main(String[] args) {

		try{
			Service9 service = new Service9();
			MyThread2 myThread = new MyThread2(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
