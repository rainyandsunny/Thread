package capter3;

public class ThreadSubstract extends Thread {

	private Subtract r;
	
	public ThreadSubstract(Subtract r){
		super();
		this.r = r;
	}
	
	@Override
	public void run(){
		r.substract();
	}
}
