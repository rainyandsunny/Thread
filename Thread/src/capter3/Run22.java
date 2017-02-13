package capter3;

public class Run22 {

	public static void main(String[] args) {

		try{
			ThreadB6 b = new ThreadB6();
			ThreadA9 a = new ThreadA9(b);
			a.start();
			b.start();
			b.join(2000);
			System.out.println("main end" + System.currentTimeMillis());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
