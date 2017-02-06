package capter2;

public class MyThread1 extends Thread {

	@Override
	public void run(){
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
}
