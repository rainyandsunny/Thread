package capter3;

/**
 * 用sleep的方法模拟等待某一个线程执行结束
 * @author yhp5210
 *
 */
public class Test {

	public static void main(String[] args) {

		MyThread threadTest = new MyThread();
		threadTest.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("我想当threadTest对象执行完毕后再执行");
		System.out.println("但上面代码中的sleep()中的值应该写多少");
		System.out.println("答案是：根据不能确定");
	}

}
