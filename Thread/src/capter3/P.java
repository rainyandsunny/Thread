package capter3;

public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				if (!ValueObject1.value.equals("")) {
					System.out.println("set wait");
					lock.wait();
				}
				Thread.sleep(1000);
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				System.out.println("setµÄÖµÊÇ" + value);
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
