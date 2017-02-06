package capter2;

public class ThreadA7 extends Thread{

	private PublicVar publicVar;
	
	public ThreadA7(PublicVar publicVar){
		super();
		this.publicVar = publicVar;
	}
	
	@Override
	public void run(){
		
		super.run();
		publicVar.setValue("B", "BB");
	}
}
