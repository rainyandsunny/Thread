package capter7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread5 extends Thread {

	private SimpleDateFormat sdf;
	private String dateString;
	
	public MyThread5(SimpleDateFormat sdf,String dateString){
		super();
		this.sdf = sdf;
		this.dateString = dateString;
	}
	
	@Override
	public void run(){
		
		try{
			//Date dateRef = sdf.parse(dateString);
			//String newDateString = sdf.format(dateRef).toString();
			
			
			//解决办法1 每个线程有自己一个SimpleDateFormat对象
			/*Date dateRef = DateTools.parse("yyyy-MM-dd", dateString);
			String newDateString = DateTools.format("yyyy-MM-dd", dateRef).toString();*/
			Date dateRef = DateTools1.getSimpleDateFormat("yyyy-MM-dd").parse(dateString);
			String newDateString = DateTools1.getSimpleDateFormat("yyyy-MM-dd").format(dateRef).toString();
			
			if(!newDateString.equals(dateString)){
				System.out.println("ThreadName=" + this.getName()
						+ "报错了 日期字符串：" + dateString + "转换成的日期为："
						+ newDateString);
			}
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
	
}
