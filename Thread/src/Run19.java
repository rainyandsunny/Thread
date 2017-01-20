
public class Run19 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++){
			MyThread20 thread1 = new MyThread20();
			thread1.setPriority(5);
			thread1.start();
			MyThread21 thread2 = new MyThread21();
			thread2.setPriority(6);
			thread2.start();
			
		}
	}

}
