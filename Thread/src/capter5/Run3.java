package capter5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask��cancel()�����ǽ����������������Ƴ�������������Ӱ��
 * 
 * @author yhp5210
 * 
 */
public class Run3 {
	
	private static Timer timer = new Timer();

	static public class MyTaskA extends TimerTask {

		@Override
		public void run() {
			System.out.println("A�����ˣ�ʱ��Ϊ��" + new Date());
			//this.cancel();TimerTask��cancel()�����ǽ����������������Ƴ�������������Ӱ��
			timer.cancel();
		}
	}

	static public class MyTaskB extends TimerTask {

		@Override
		public void run() {
			System.out.println("B�����ˣ�ʱ��Ϊ��" + new Date());
		}
	}

	public static void main(String[] args) {

		try {
			MyTaskA taskA = new MyTaskA();
			MyTaskB taskB = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2014-10-12 09:12:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("�ַ���ʱ�䣺" + dateRef.toLocaleString() + "��ǰʱ�䣺"
					+ new Date().toLocaleString());
			timer.schedule(taskA, dateRef, 4000);
			timer.schedule(taskB, dateRef, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
