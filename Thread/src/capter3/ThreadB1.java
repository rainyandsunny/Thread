package capter3;

public class ThreadB1 extends Thread {

	private Object lock;

	public ThreadB1(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					MyList1.add();
					if (MyList1.size() == 5) {
						lock.notify();
						System.out.println("已发出通知！");
					}
					System.out.println("添加了" + (i + 1));
					Thread.sleep(1000);
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
