package capter2;

/**
 * 同步不当出现脏读现象
 * @author yhp5210
 *
 */
public class Run16 {

	public static void main(String[] args) {

		MyOneList list = new MyOneList();
		ThreadA14 thread1 = new ThreadA14(list);
		thread1.setName("A");
		thread1.start();
		ThreadB14 thread2 = new ThreadB14(list);
		thread2.setName("B");
		thread2.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("listSize="+list.getSize());
	}

}
