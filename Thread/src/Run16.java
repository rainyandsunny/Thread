
/**
 * yield的作用是放弃当前的CPU资源，将它让给其他的任务去占用CPU执行时间。
 * 但是放弃的时间不确定，有可能刚刚放弃，又重新得到cpu时间片
 * @author yhp5210
 *
 */
public class Run16 {

	public static void main(String[] args) {
		
		MyThread15 thread = new MyThread15();
		thread.start();
	}

}
