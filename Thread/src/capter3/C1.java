package capter3;

public class C1 {
	
	private String lock;
	
	public C1(String lock){
		super();
		this.lock = lock;
	}
	
	public void getValue(){
		try{
			synchronized (lock) {
				while(ValueObject1.value.equals("")){
					System.out.println("消费者" + Thread.currentThread().getName()
							+ "WAITING了");
					lock.wait();
				}
				System.out.println("消费者 " + Thread.currentThread().getName()
						+ "RUNNABLE了");
				ValueObject1.value = "";
				lock.notify();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
