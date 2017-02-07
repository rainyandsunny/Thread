package capter2;

public class ThreadB13 extends Thread {

	private MyList list;
	
	public ThreadB13(MyList list){
		super();
		this.list = list;
	}
	
	@Override
	public void run(){
		for(int i = 0;i < 100000; i++){
			list.add("threadB" + (i + 1));
		}
	}
}
