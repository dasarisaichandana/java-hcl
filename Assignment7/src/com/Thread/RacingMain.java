package com.Thread;

public class RacingMain {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
        Thread4 t4=new Thread4();
		
		Thread5 t5=new Thread5();
		Thread6 t6=new Thread6();
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		

	}

}
