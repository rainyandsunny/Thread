package capter3;

public class Run13 {

	public static void main(String[] args) {

		MyStack myStack = new MyStack();
		P_Thread pThread = new P_Thread(myStack);
		C_Thread rThread = new C_Thread(myStack);
		pThread.start();
		rThread.start();
	}

}
