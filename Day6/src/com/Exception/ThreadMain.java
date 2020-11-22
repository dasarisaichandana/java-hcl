package com.Exception;

//import com.Exception.ThreadExam.Thread1;
//import com.Exception.ThreadExam.Thread2;

public class ThreadMain {

	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		
		Thread2 t2=new Thread2();
		
		Runnable r1=new Runnable1();
		Thread t3=new Thread(r1);
		Runnable r2=new Runnable2();
		Thread t4=new Thread(r2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
