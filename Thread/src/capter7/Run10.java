package capter7;

/**
 * 线程组异常的处理，自定义ThreadGroup实现uncaughtException方法
 * @author yhp5210
 *
 */
public class Run10 {

	public static void main(String[] args) {

		MyThreadGroup group = new MyThreadGroup("我的线程组");
		MyThread8[] myThread = new MyThread8[10];
		for(int i = 0; i < myThread.length; i++){
			myThread[i] = new MyThread8(group,"线程" + (i + 1),"1");
			myThread[i].start();
		}
		MyThread8 newT = new MyThread8(group,"报错线程","a");
		newT.start();
	}

}
