package capter4;

/**
 * getHoldCount()的作用是查询当前线程保持此锁定的个数
 * @author yhp5210
 *
 */
public class Run11 {

	public static void main(String[] args) {

		Service1 service = new Service1();
		service.serviceMethod1();
	}

}
