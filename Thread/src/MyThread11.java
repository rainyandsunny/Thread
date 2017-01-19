
/**
 * 调用stop方法会出现异常
 * @author yhp5210
 *
 */
public class MyThread11 extends Thread{

	@Override
	public void run(){
		
		try{
			this.stop();
		}catch(ThreadDeath e){
			System.out.println("进入了catch()方法！");
			e.printStackTrace();
		};
		
	}
}
