package capter2;

/**
 * 锁变化所以会异步执行
 * @author yhp5210
 *
 */
public class MyService1 {

	private String lock = "123";

	public void testMethod(){
		
		try{
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + " begin "
						+ System.currentTimeMillis());
				lock = "456";
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " end "
						+ System.currentTimeMillis());
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
