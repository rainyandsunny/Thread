package capter2;

import java.util.concurrent.atomic.AtomicLong;

public class MyService2 {

	public static AtomicLong aiRef = new AtomicLong();
	
	public void addNum(){
		System.out.println(Thread.currentThread().getName() + "����100֮���ֵΪ��"
				+ aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}
}
