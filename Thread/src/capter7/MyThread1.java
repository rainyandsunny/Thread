package capter7;

public class MyThread1 extends Thread {

	@Override
	public void run(){
		try{
			System.out.println("begin sleep");
			Thread.sleep(10000);
			System.out.println("end sleep");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
