package capter3;

public class Run18 {

	public static void main(String[] args) {

		try{
			ThreadB4 b = new ThreadB4();
			b.start();
			Thread.sleep(500);
			ThreadC3 c = new ThreadC3(b);
			c.start();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
