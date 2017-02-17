package capter7;

import java.text.SimpleDateFormat;

/**
 * SimpleDateFormat非线程安全(解决办法)
 * @author yhp5210
 *
 */
public class Run5 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] dateStringArray = new String[]{
				"2000-01-01","2000-01-02","2000-01-03","2000-01-04",
				"2000-01-05","2000-01-06","2000-01-07","2000-01-08",
				"2000-01-09","2000-01-10",
		};
		MyThread5[] threadArray = new MyThread5[10];
		for(int i = 0; i < 10; i++ ){
			threadArray[i] = new MyThread5(sdf, dateStringArray[i]);
		}
		for(int i = 0; i < 10 ; i++){
			threadArray[i].start();
		}
	}

}
