
public class MyThread3 extends Thread {

	@Override
	public void run(){
		System.out.println("run=" + this.isAlive());
	}
}
