package com.files;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedEx {

	public static void main(String[] args) throws IOException {
		final PipedWriter pw=new PipedWriter();
		final PipedReader pr=new PipedReader();
		
		pr.connect(pw);
		Thread t1=new Thread() {
			public void run() {
				try {
					pw.write("my name is sai");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		Thread t2=new Thread() {
			public void run() {
		
			try {
			int i;
			while((i=pr.read())!=-1) {
				
				System.out.print((char)i);
				Thread.sleep(1000);
			}
			}catch(Exception e) {
				
			}
		}
	};
	t1.start();
	t2.start();
			
		

	}

}
