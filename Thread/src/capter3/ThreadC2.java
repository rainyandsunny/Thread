package capter3;

public class ThreadC2 extends Thread {

	private C1 r;
	
	public ThreadC2(C1 r){
		super();
		this.r = r;
	}
	
	@Override
	public void run(){
		while(true){
			r.getValue();
		}
	}
}
