package capter2;

/**
 * volatile���÷�
 * @author yhp5210
 *
 */
public class Run36 {

	public static void main(String[] args) {

		try {
			RunThread thread = new RunThread();
			thread.start();
			thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("�Ѿ���ֵΪfalse");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
