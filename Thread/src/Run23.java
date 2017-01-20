/**
 * 守护线程示例
 * 当进程中不存在非守护线程的时候，守护线程自动销毁。（典型应用GC）
 * @author yhp5210
 *
 */
public class Run23 {

	public static void main(String[] args) {

		try{
			MyThread22 thread = new MyThread22();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(5000);
			System.out.println("我离开thread对象也不再打印了，也就是停止了！");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
