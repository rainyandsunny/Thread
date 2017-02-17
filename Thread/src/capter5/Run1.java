package capter5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * һ��Timer��Ӧ���task
 * @author yhp5210
 *
 */
public class Run1 {

	private static Timer timer = new Timer();
	static public class MyTask1 extends TimerTask{
		
		@Override
		public void run(){
			System.out.println("�����ˣ�ʱ��Ϊ��" + new Date());
		}
	}
	static public class MyTask2 extends TimerTask{
		
		@Override
		public void run(){
			System.out.println("�����ˣ�ʱ��Ϊ��" + new Date());
		}
	}
	public static void main(String[] args) {
		
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2014-10-12 10:39:00";
			String dateString2 = "2014-10-12 10:40:00";
			try {
				Date dateRef1 = sdf1.parse(dateString1);
				Date dateRef2 = sdf2.parse(dateString2);
				System.out.println("�ַ���1ʱ�䣺" + dateRef1.toLocaleString()
						+ "��ǰʱ�䣺" + new Date().toLocaleString());
				System.out.println("�ַ���2ʱ�䣺" + dateRef2.toLocaleString()
						+ "��ǰʱ�䣺" + new Date().toLocaleString());
				timer.schedule(task1, dateRef1);
				timer.schedule(task2, dateRef2);
			} catch (java.text.ParseException e) {
				e.printStackTrace();
			}
			
	}

}
