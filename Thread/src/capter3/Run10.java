package capter3;

/**
 * ����ֻ������һ�������ߣ���������һ�������������ȴ�
 * @author yhp5210
 *
 */
public class Run10 {

	public static void main(String[] args) {

		String lock = new String("");
		Add add = new Add(lock);
		Subtract subtract = new Subtract(lock);
		ThreadSubstract subtract1Thread = new ThreadSubstract(subtract);
		subtract1Thread.setName("subtract1Thread");
		subtract1Thread.start();
		ThreadSubstract subtract2Thread = new ThreadSubstract(subtract);
		subtract2Thread.setName("subtract2Thread");
		subtract2Thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadAdd addThread = new ThreadAdd(add);
		addThread.setName("addThread");
		addThread.start();
	}

}
