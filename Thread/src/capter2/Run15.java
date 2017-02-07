package capter2;

public class Run15 {

	public static void main(String[] args) {

		MyList mylist = new MyList();
		ThreadA13 a = new ThreadA13(mylist);
		a.setName("A");
		a.start();
		ThreadB13 b = new ThreadB13(mylist);
		b.setName("B");
		b.start();
	}

}
