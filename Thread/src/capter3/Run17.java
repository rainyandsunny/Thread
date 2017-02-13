package capter3;

/**
 * 方法join()的作用是使所属的线程对象x正常执行run()方法中的任务，
 * 而使当前线程z进行无限期的阻塞，等待线程x销毁后再继续执行线程。
 * @author yhp5210
 *
 */
public class Run17 {

	public static void main(String[] args) {

		try{
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();
			System.out.println("我想当threadTest对象执行完毕后我再执行");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
