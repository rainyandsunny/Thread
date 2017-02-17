package capter6;

public class MyThread2 extends Thread {

	@Override
	public void run(){
		
		System.out.println(MyObject2.getInstance().hashCode());
	}
}
