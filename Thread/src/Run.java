
public class Run {

	public static void main(String[] args) {

		//����������
		/*MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();*/
		
		//��������
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
		
		//ͬ������
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
		
		//isAlive����
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
		 * ��ΰ�ȫֹͣ�߳�
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
		
		
		//interrupted()������ʾ���ǵ�ǰ�߳��Ƿ��Ѿ�ֹͣ
		try {
			
			MyThread4 thread = new MyThread4();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("�Ƿ�ֹͣ1��="+thread.interrupted());
			System.out.println("�Ƿ�ֹͣ2��="+thread.interrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("main catch");
		}
		System.out.println("end!");
		
		
	}

}
