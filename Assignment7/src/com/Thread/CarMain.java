package com.Thread;

public class CarMain {

	public static void main(String[] args) {
	

		
				carThread ct=new carThread();
				ct.start();
				//ct.sleep(10);
				carThread2 ct2=new carThread2();
				ct2.start();
				carThread3 ct3=new carThread3();
				ct3.start();
				carThread4 ct4=new carThread4();
				ct4.start();
				carThread5 ct5=new carThread5();
				ct5.start();
				carThread6 ct6=new carThread6();
				ct6.start();
				
			}

		


	}


