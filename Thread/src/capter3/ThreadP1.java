package capter3;

public class ThreadP1 extends Thread {

	private P1 p;
	
	public ThreadP1(P1 p){
		super();
		this.p = p;
	}
	
	@Override
	public void run(){
		while(true){
			p.setValue();
		}
	}
}
