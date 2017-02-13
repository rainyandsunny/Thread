package capter3;

import java.io.PipedWriter;

public class ThreadWrite1 extends Thread {

	private WriteData1 write;
	private PipedWriter out;
	
	public ThreadWrite1(WriteData1 write,PipedWriter out){
		super();
		this.write = write;
		this.out = out;
	}
	
	@Override
	public void run(){
		write.writeMethod(out);
	}
}
