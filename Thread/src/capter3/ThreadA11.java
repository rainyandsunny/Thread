package capter3;

public class ThreadA11 extends Thread {

	@Override
	public void run(){
		try{
			for(int i = 0; i < 2; i++){
				System.out.println("��ThreadA�߳���ȡֵ=" + Tools1.tl.get());
				Thread.sleep(100);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
