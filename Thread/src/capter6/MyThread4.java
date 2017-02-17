package capter6;

public class MyThread4 extends Thread {

	@Override
	public void run(){
		
		System.out.println(MyObject4.getInstance().hashCode());
	}
}
