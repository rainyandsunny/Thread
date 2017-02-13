
public class BasicThreads {

	
	public static void main(String[] args) {
		
		/*LiftOff launch = new LiftOff();
		launch.run();*/
		/*Thread t = new Thread(new LiftOff());
		t.start();*/
		for(int i=0;i<5;i++){
			new Thread(new LiftOff()).start();
		}
		System.out.println("wait for LiftOff");
	}

}
