package capter2;

public class ThreadB14 extends Thread {

	private MyOneList list;
	
	public ThreadB14(MyOneList list){
		super();
		this.list = list;
	}
	
	@Override
	public void run(){
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "B");
	}
}
