package capter7;

public class MyThread extends Thread {

	public MyThread(){
		System.out.println("���췽���е�״̬��" + Thread.currentThread().getState());
	}
	
	@Override
	public void run(){
		System.out.println("run�����е�״̬��" + Thread.currentThread().getState());
	}
}
