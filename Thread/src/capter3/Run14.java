package capter3;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 通过管道进行线程间通信：字节流
 * @author yhp5210
 *
 */
public class Run14 {

	public static void main(String[] args) {

		try{
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();
			inputStream.connect(outputStream);
			ThreadRead threadRead = new ThreadRead(readData,inputStream);
			threadRead.start();
			Thread.sleep(2000);
			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();
		}catch(Exception e){
			
		}
	}
}
