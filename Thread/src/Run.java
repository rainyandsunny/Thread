
public class Run {

	public static void main(String[] args) {

		//不共享数据
		/*MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();*/
		
		//共享数据
		/*MyThread myThread = new MyThread();
		Thread a = new Thread(myThread,"A");
		Thread b = new Thread(myThread,"B");
		Thread c = new Thread(myThread,"C");
		Thread d = new Thread(myThread,"D");
		Thread e = new Thread(myThread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();*/
		
		//同步问题
		/*ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();*/
		
		
		
		/*MyThread run = new MyThread();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		Thread t4 = new Thread(run);
		Thread t5 = new Thread(run);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();*/
		
		/*CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();*/
		
		//isAlive方法
		/*MyThread3 thread = new MyThread3(); 
		System.out.println("begin == "+thread.isAlive());
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end == "+thread.isAlive());*/
		
		
		/**
		 * 如何安全停止线程
		 */
		/*try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("main catch");
		}*/
		
		
		//interrupted()方法表示的是当前线程是否已经停止
		try {
			
			MyThread4 thread = new MyThread4();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止1？="+thread.interrupted());
			System.out.println("是否停止2？="+thread.interrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("main catch");
		}
		System.out.println("end!");
		
		
	}

}
