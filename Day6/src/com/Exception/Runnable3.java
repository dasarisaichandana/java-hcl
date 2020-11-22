package com.Exception;


 class Runnable1 implements Runnable {


	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		int a=10;
		int b=20;
		System.out.println("division is"+(a/b));
		}
		
		
	}
}
class Runnable2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		int a=40;
		int b=20;
		System.out.println("modular is"+(a%b));
		}
		
	}
	
}

