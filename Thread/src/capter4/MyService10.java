package capter4;

import java.util.concurrent.locks.ReentrantLock;

public class MyService10 {

	public ReentrantLock lock = new ReentrantLock();
	
	public void waitMethod(){
		if(lock.tryLock()){
			System.out.println(Thread.currentThread().getName() + "�����");
		}else{
			System.out.println(Thread.currentThread().getName() + "û�л����");
		}
	}
}
