package capter3;

public class ThreadC1 extends Thread {

	private C r;
	
	public ThreadC1(C r){
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
