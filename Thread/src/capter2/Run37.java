package capter2;

/**
 * 关键字volatile虽然增加了实例变量在多个线程之间的可见性，但它却不具备同步性。
 * @author yhp5210
 *
 */
public class Run37 {

	public static void main(String[] args) {

		MyThread2[] myThreadArray = new MyThread2[100];
		for(int i = 0; i < 100; i++){
			myThreadArray[i] = new MyThread2();
		}
		
		for(int i = 0; i < 100; i++){
			myThreadArray[i].start();
		}
	}

}
