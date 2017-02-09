package capter3;

/**
 * 没有同步加锁调用wait会出现异常
 * @author yhp5210
 *
 */
public class Run1 {

	public static void main(String[] args) {

		try{
			String newString = new String("");
			newString.wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
