package capter2;

public class ThreadA14 extends Thread {

	private MyOneList list;
	
	public ThreadA14(MyOneList list){
		super();
		this.list = list;
	}
	
	@Override
	public void run(){
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "A");
	}
}
