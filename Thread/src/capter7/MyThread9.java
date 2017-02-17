package capter7;

public class MyThread9 extends Thread {

	private String num = "a";
	
	public MyThread9(){
		super();
	}
	
	public MyThread9(ThreadGroup group,String name){
		super(group,name);
	}
	
	@Override
	public void run(){
		int numInt = Integer.parseInt(num);
		System.out.println("在线程中打印：" + (numInt + 1));
	}
}
