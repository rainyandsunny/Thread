/**
 * �̵߳����ȼ����м̳��ԣ�A����B�̣߳�B�����ȼ���A��һ����
 * @author yhp5210
 *
 */
public class Run17 {

	public static void main(String[] args) {

		System.out.println("main thread begin priority="+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end priority="+Thread.currentThread().getPriority());
		MyThread16 thread = new MyThread16();
		thread.start();
	}

}
