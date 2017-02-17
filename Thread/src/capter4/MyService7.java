package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService7 {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	
	public void set(){
		try{
			lock.lock();
			while(hasValue){
				condition.await();
			}
			System.out.println("��ӡ��");
			hasValue = true;
			condition.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void get(){
		try{
			lock.lock();
			while(!hasValue){
				condition.await();
			}
			System.out.println("��ӡ��");
			hasValue = false;
			condition.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	
}
