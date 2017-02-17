package capter5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run6 {

	private static Timer timer = new Timer();

	static public class MyTask1 extends TimerTask {

		@Override
		public void run() {
			System.out.println("1 begin �����ˣ�ʱ��Ϊ��" + new Date());
			System.out.println("1   end �����ˣ�ʱ��Ϊ��" + new Date());
		}

	}

	public static void main(String[] args) {

		try{
			MyTask1 task1 = new MyTask1();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2017-2-16 09:40:00";
			Date dateRef1 = sdf1.parse(dateString1);
			System.out.println("�ַ���1ʱ�䣺" + dateRef1.toLocaleString()
					+ "��ǰʱ�䣺" + new Date().toLocaleString());
			timer.scheduleAtFixedRate(task1, dateRef1, 5000);
		}catch(ParseException e){
			e.printStackTrace();
		}
	}

}
