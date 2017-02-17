package capter7;

public class MyThread7 extends Thread {

	private String num;
	
	public MyThread7(ThreadGroup group,String name,String num){
		super(group,name);
		this.num = num;
	}
	
	@Override
	public void run(){
		int numInt = Integer.parseInt(num);
		while(true){
			System.out.println("À¿—≠ª∑÷–" + Thread.currentThread().getName());
		}
	}
}
