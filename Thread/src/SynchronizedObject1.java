
public class SynchronizedObject1 {

	synchronized public void printString(){
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("a�߳���Զsuspend�ˣ�");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
