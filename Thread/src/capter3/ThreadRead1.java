package capter3;

import java.io.PipedReader;

public class ThreadRead1 extends Thread {

	private ReadData1 read;
	private PipedReader input;
	
	public ThreadRead1(ReadData1 read,PipedReader input){
		super();
		this.read = read;
		this.input = input;
	}
	
	@Override
	public void run(){
		read.readMethod(input);
	}
}
