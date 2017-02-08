package capter2;

import java.util.concurrent.atomic.AtomicLong;

public class MyService2 {

	public static AtomicLong aiRef = new AtomicLong();
	
	public void addNum(){
		System.out.println(Thread.currentThread().getName() + "加了100之后的值为："
				+ aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}
}
