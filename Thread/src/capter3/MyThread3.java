package capter3;

public class MyThread3 extends Thread {

	@Override
	public void run() {
		
		try{
			System.out.println("begin Timer=" + System.currentTimeMillis());
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
