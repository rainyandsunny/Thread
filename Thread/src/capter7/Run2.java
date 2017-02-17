package capter7;

/**
 * 等待进入同步方法，状态为BLOCKED
 * @author yhp5210
 *
 */
public class Run2 {

	public static void main(String[] args) {
		
		MyThread2 t1 = new MyThread2();
		t1.setName("a");
		t1.start();
		MyThread3 t2 = new MyThread3();
		t2.setName("b");
		t2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main方法中的t2状态：" + t2.getState());
	}

}
