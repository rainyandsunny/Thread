package capter3;

public class C_Thread extends Thread {

	private MyStack stack;
	
	public C_Thread(MyStack stack){
		this.stack = stack;
	}
	
	@Override
	public void run(){
		while(true){
			stack.pop();
		}
	}
}
