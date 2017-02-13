
public class MyThread13 extends Thread {

	@Override
	public void run(){
		while(true){
			if(this.isInterrupted()){
				System.out.println("Õ£÷π¡À");
				return;
			}
			System.out.println("timer="+System.currentTimeMillis());
		}
	}
}
