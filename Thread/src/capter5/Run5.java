package capter5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * scheduleAtFixedRate������ʱ���ڶ�������ʼʱ������һ���������ʱ��Ϊ׼
 * scheduleAtFixedRate��������ʱ���ڶ�������ʼʱ������һ������ʼʱ��Ϊ׼
 * @author yhp5210
 *
 */
public class Run5 {

	private static Timer timer = new Timer();
	private static int runCount = 0;
	
	static public class MyTask1 extends TimerTask{
		
		@Override
		public void run(){
			
			try{
				System.out.println("1 begin �����ˣ�ʱ��Ϊ��" + new Date());
				Thread.sleep(2000);
				System.out.println("1 end �����ˣ�ʱ��Ϊ��" + new Date());
				runCount ++;
				if(runCount == 5){
					//timer.cancel();
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		try{
			MyTask1 task1 = new MyTask1();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2017-02-16 10:12:00";
			Date dateRef1 = sdf1.parse(dateString1);
			System.out.println("�ַ���1ʱ�䣺" + dateRef1.toLocaleString()
					+ "��ǰʱ�䣺" + new Date().toLocaleString());
			timer.scheduleAtFixedRate(task1, dateRef1, 5000);
		}catch(ParseException e){
			e.printStackTrace();
		}
		
	}

}
