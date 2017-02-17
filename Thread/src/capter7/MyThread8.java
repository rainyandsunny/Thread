package capter7;

public class MyThread8 extends Thread {

	private String num;
	
	public MyThread8(ThreadGroup group,String name,String num){
		super(group,name);
		this.num = num;
	}
	
	@Override
	public void run(){
		int numInt = Integer.parseInt(num);
		while(!this.isInterrupted()){
			System.out.println("À¿—≠ª∑÷–£∫" + Thread.currentThread().getName());
		}
	}
	
}
