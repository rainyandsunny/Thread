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

	private static Timer timer = new Timer();//可以看到运行结束后还呈红色，原因是因为Timer在创建的时候会启动一个线程，该线程并不是守护线程
	
	//private static Timer timer = new Timer(true);此时为守护线程
	static public class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("运行了！时间为：" + new Date());
		}

	}

	public static void main(String[] args) {

		MyTask task = new MyTask();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = "2014-10-12 11:55:00";
		try {
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间：" + dateRef.toLocaleString());
			timer.schedule(task, dateRef);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
	}

}
