package capter3;

/**
 * û��ͬ����������wait������쳣
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
