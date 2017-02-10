package capter3;

public class C {

	private String lock;
	
	public C(String lock){
		super();
		this.lock = lock;
	}
	
	public void getValue(){
		try{
			synchronized (lock) {
				if(ValueObject1.value.equals("")){
					System.out.println("get wait");
					lock.wait();
				}
				System.out.println("getµÄÖµÊÇ" + ValueObject1.value);
				ValueObject1.value = "";
				lock.notify();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
