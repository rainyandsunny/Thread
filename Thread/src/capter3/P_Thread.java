package capter3;

public class P_Thread extends Thread {

	private MyStack stack;
	
	public P_Thread(MyStack stack){
		this.stack = stack;
	}
	
	
	@Override
	public void run(){
		while(true){
			stack.push();
		}
	}
}
