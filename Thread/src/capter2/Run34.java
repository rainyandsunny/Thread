package capter2;

/**
 * �����߳�����ѭ��������ִ����������
 * @author yhp5210
 *
 */
public class Run34 {

	public static void main(String[] args) {

		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("��Ҫֹͣ���� stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
