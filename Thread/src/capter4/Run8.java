package capter4;

public class Run8 {

	public static void main(String[] args) {

		MyService8 service = new MyService8();
		MyThreadA1[] threadA = new MyThreadA1[10];
		MyThreadB1[] threadB = new MyThreadB1[10];
		for(int i = 0; i < 10; i++){
			threadA[i] = new MyThreadA1(service);
			threadB[i] = new MyThreadB1(service);
			threadA[i].start();
			threadB[i].start();
		}
	}

}
