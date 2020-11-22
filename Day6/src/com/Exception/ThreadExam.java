package com.Exception;

 class Thread1 extends Thread{
	public void run( ) {
		for(int i=0;i<5;i++) {
		int a=10;
		int b=22;
		System.out.println("addition is"+(a+b));
		}
		
	}

}
class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		int a=34;
		int b=45;
		System.out.println("subtracion is"+(a-b));
		}
		
	}
}

