package capter3;

public class Run23 {
	public static ThreadLocal tl = new ThreadLocal<>();
	
	public static void main(String[] args) {

		if(null == tl.get()){
			System.out.println("从未放过值");
			tl.set("我的值");
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
		
	}

}
