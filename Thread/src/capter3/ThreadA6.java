package capter3;

public class ThreadA6 extends Thread {
	
	@Override
	public void run(){
		
		for(int i = 0;i < Integer.MAX_VALUE; i++){
			String newString = new String();
			Math.random();
		}
	}
}
