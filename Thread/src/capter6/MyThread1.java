package capter6;

public class MyThread1 extends Thread {

	@Override
	public void run(){
		
		System.out.println(MyObject1.getInstance().hashCode());
	}
}
