package capter5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * 
 * @author yhp5210
 *
 */
public class Run {

	private static Timer timer = new Timer();//���Կ������н����󻹳ʺ�ɫ��ԭ������ΪTimer�ڴ�����ʱ�������һ���̣߳����̲߳������ػ��߳�
	
	//private static Timer timer = new Timer(true);��ʱΪ�ػ��߳�
	static public class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("�����ˣ�ʱ��Ϊ��" + new Date());
		}

	}

	public static void main(String[] args) {

		MyTask task = new MyTask();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = "2014-10-12 11:55:00";
		try {
			Date dateRef = sdf.parse(dateString);
			System.out.println("�ַ���ʱ�䣺" + dateRef.toLocaleString());
			timer.schedule(task, dateRef);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
	}

}
