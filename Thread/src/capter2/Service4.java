package capter2;

public class Service4 {

	public void testMethod1(MyObject object){
		synchronized (object) {
			try{
				System.out.println("testMethod1 ¡ª¡ªgetLock time="
						);
				Thread.sleep(2000);
				System.out.println("testMethod1 releaseLock time="
						+ System.currentTimeMillis() + " run ThreadName="
						+ Thread.currentThread().getName());
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
