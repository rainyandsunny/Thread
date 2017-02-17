package capter7;

public class Run4 {

	public static void main(String[] args) {

		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("runMethod!");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread newThread = new Thread(group, runnable);
		newThread.setName("Z");
		newThread.start();
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread()
				.getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main线程中有多少个子线程组：" + listGroup.length
				+ "名字为：" + listGroup[0].getName());
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		System.out.println(listThread[0].getName());
	}

}
