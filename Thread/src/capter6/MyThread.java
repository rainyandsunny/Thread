package capter6;

public class MyThread extends Thread {

	@Override
	public void run(){
		
		System.out.println(MyObject.getInstance().hashCode());
	}
}
