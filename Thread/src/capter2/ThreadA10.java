package capter2;

public class ThreadA10 extends Thread {

	private Task task;
	
	public ThreadA10(Task task){
		super();
		this.task = task;
	}
	
	@Override
	public void run(){
		super.run();
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
	
}
