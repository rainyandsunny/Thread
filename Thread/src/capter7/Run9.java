package capter7;

/**
 * 线程组中某个线程出现异常，其他线程照样执行
 * @author yhp5210
 *
 */
public class Run9 {

	public static void main(String[] args) {

		ThreadGroup group = new ThreadGroup("我的线程组");
		MyThread7[] myThread = new MyThread7[10];
		for(int i = 0;i < myThread.length; i++){
			myThread[i] = new MyThread7(group,"线程" + (i + 1),"1");
			myThread[i].start();
		}
		MyThread7 newT = new MyThread7(group,"线程报错","a");
		newT.start();
	}

}
