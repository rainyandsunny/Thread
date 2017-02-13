package capter3;

public class P1 {

	private String lock;

	public P1(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!ValueObject1.value.equals("")) {
					System.out.println("������" + Thread.currentThread().getName()
							+ "WAITING�ˡ�");
					lock.wait();
					
				}
				System.out.println("������ " + Thread.currentThread().getName()
						+ "RUNNABLE��");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				ValueObject1.value = value;
				lock.notify();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
