package capter2;

/**
 * synchronizedµÄ±×¶Ë
 * @author yhp5210
 *
 */
public class Run12 {

	public static void main(String[] args) {

		Task task = new Task();
		ThreadA10 thread1 = new ThreadA10(task);
		thread1.start();
		ThreadB10 thread2 = new ThreadB10(task);
		thread2.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime2 < CommonUtils.beginTime1){
			beginTime = CommonUtils.beginTime2;
		}
		long endTime = CommonUtils.endTime1;
		if(CommonUtils.endTime2 > CommonUtils.endTime1){
			endTime = CommonUtils.endTime2;
		}
		System.out.println("ºÄÊ±£º"+((endTime - beginTime) / 1000));
	}

}
