package capter5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask的cancel()方法是将自身从人物队列中移除，其他任务不受影响
 * 
 * @author yhp5210
 * 
 */
public class Run3 {
	
	private static Timer timer = new Timer();

	static public class MyTaskA extends TimerTask {

		@Override
		public void run() {
			System.out.println("A运行了！时间为：" + new Date());
			//this.cancel();TimerTask的cancel()方法是将自身从人物队列中移除，其他任务不受影响
			timer.cancel();
		}
	}

	static public class MyTaskB extends TimerTask {

		@Override
		public void run() {
			System.out.println("B运行了！时间为：" + new Date());
		}
	}

	public static void main(String[] args) {

		try {
			MyTaskA taskA = new MyTaskA();
			MyTaskB taskB = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2014-10-12 09:12:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间："
					+ new Date().toLocaleString());
			timer.schedule(taskA, dateRef, 4000);
			timer.schedule(taskB, dateRef, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
