package capter3;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

public class WriteData1 {
	public void writeMethod(PipedWriter out){
		try{
			System.out.println("write: ");
			for(int i = 0; i < 30; i++){
				String outData = "" + (i + 1);
				out.write(outData);
				System.out.print("writeMethod: " + outData);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
			out.close();
		}catch(IOException e){}
	}
}
