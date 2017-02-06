package capter2;

public class ThreadB10 extends Thread {

	private Task task;
	
	public ThreadB10(Task task){
		super();
		this.task = task;
	}
	
	@Override
	public void run(){
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
}
