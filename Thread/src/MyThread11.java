
/**
 * ����stop����������쳣
 * @author yhp5210
 *
 */
public class MyThread11 extends Thread{

	@Override
	public void run(){
		
		try{
			this.stop();
		}catch(ThreadDeath e){
			System.out.println("������catch()������");
			e.printStackTrace();
		};
		
	}
}
