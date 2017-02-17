package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService2 {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await(){
		
		try{
			condition.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
