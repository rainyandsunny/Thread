
public class MyThread13 extends Thread {

	@Override
	public void run(){
		while(true){
			if(this.isInterrupted()){
				System.out.println("ֹͣ��");
				return;
			}
			System.out.println("timer="+System.currentTimeMillis());
		}
	}
}
