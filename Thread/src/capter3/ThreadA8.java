package capter3;

/**
 * join()方法会释放锁
 * @author yhp5210
 *
 */
public class ThreadA8 extends Thread {

	private ThreadB5 b;
	
	public ThreadA8(ThreadB5 b){
		super();
		this.b = b;
	}
	
	@Override
	public void run(){
		
		try{
			synchronized (b) {
				b.start();
				b.join();
				for(int i = 0; i < Integer.MAX_VALUE; i++){
					String newString = new String();
					Math.random();
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
