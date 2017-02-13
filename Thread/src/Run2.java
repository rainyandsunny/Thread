
/**
 * 测试当前线程是否已经是中断状态，之后后具有将该状态标志置清除为false的功能
 * interrupted方法的使用
 * @author yhp5210
 *
 */
public class Run2 {

	public static void main(String[] args) {

		Thread.currentThread().interrupt();
		System.out.println("是否停止1？ ="+Thread.interrupted());
		System.out.println("是否停止2？ ="+Thread.interrupted());
		System.out.println("end!");
	}

}
