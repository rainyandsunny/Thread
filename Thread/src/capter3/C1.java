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
					System.out.println("������" + Thread.currentThread().getName()
							+ "WAITING��");
					lock.wait();
				}
				System.out.println("������ " + Thread.currentThread().getName()
						+ "RUNNABLE��");
				ValueObject1.value = "";
				lock.notify();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
