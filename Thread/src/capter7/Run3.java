package capter7;

/**
 * ִ��wait/await������WAITING״̬
 * @author yhp5210
 *
 */
public class Run3 {

	public static void main(String[] args) {

		try{
			MyThread4 t = new MyThread4();
			t.start();
			Thread.sleep(1000);
			System.out.println("main�����е�t״̬��" + t.getState());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
