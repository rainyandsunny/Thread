package capter2;

/**
 * ��Ȼ�ܹ�ֹͣ���̣߳����������� -server������ģʽ��64bit��JVM��ʱ���������ѭ��
 * volatile��ǿ�ƴӹ�����ջ��ȡ�ñ�����ֵ�������Ǵ��߳�˽������ջ��ȡ�ñ�����ֵ��
 * @author yhp5210
 *
 */
public class Run35 {

	public static void main(String[] args) {
		
		PrintString1 printStringService = new PrintString1();
		new Thread(printStringService).start();
		System.out.println("��Ҫֹͣ����stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
