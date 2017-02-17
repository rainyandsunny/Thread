package capter7;

/**
 * 执行wait/await方法后，WAITING状态
 * @author yhp5210
 *
 */
public class Run3 {

	public static void main(String[] args) {

		try{
			MyThread4 t = new MyThread4();
			t.start();
			Thread.sleep(1000);
			System.out.println("main方法中的t状态：" + t.getState());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
