package capter3;

/**
 * 多个生产者多个消费者出现假死的现象
 * @author yhp5210
 *
 */
public class Run12 {

	public static void main(String[] args) {

		String lock = new String("");
		P1 p = new P1(lock);
		C1 r = new C1(lock);
		ThreadP1[] pThread = new ThreadP1[2];
		ThreadC2[] rThread = new ThreadC2[2];
		for (int i = 0; i < 2; i++) {
			pThread[i] = new ThreadP1(p);
			pThread[i].setName("生产者" + (i + 1));
			rThread[i] = new ThreadC2(r);
			rThread[i].setName("消费者" + (i + 1));
			pThread[i].start();
			rThread[i].start();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread[] threadArray = new Thread[Thread.currentThread()
				.getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for(int i = 0; i < threadArray.length; i++){
			System.out.println(threadArray[i].getName() + " "
					+ threadArray[i].getState());
		}
	}

}
