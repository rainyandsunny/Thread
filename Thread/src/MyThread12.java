
public class MyThread12 extends Thread{

	private SynchronizedObject object;
	
	public MyThread12(SynchronizedObject object){
		
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		object.printString("b","bb");
	}
}
