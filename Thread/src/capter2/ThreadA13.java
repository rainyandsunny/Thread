package capter2;

public class ThreadA13 extends Thread {

	private MyList list;
	
	public ThreadA13(MyList list){
		super();
		this.list = list;
	}
	
	@Override
	public void run(){
		for(int i = 0;i < 100000; i++){
			list.add("threadA" + (i + 1));
		}
	}
}
