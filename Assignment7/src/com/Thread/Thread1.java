package com.Thread;

import java.util.Random;

class Thread1 extends Thread {
	public void run() {
		
		for(int i=0;i<=100;i++) {
		if(i==50) {
	       Racing.display(1);
			
		}
		
		else if ( i==100) {
		Racing.racewin(1);
	}
		Random r=new Random();
		int q=r.nextInt(6);
		
}	
	}
}
	
class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i==50) {
			Racing.display(2);
			}
			else if(i==100) {
				Racing.racewin(2);
			}
			Random r=new Random();
			int q=r.nextInt(6);
			
		}	
		
	}

 }
 class Thread3 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i==50) {
			Racing.display(3);
			}
			else if(i==100) {
				Racing.racewin(3);
			}
			Random r=new Random();
			int q=r.nextInt(6);
			
		}	
		
	}
	

 }
 class Thread4 extends Thread{
		public void run() {
			for(int i=0;i<=100;i++) {
				if(i==50) {
				Racing.display(4);
				}
				else if(i==100) {
					Racing.racewin(4);
				}
				Random r=new Random();
				int q=r.nextInt(6);
				
			}	
			
		}
		

	 }
 class Thread5 extends Thread{
		public void run() {
			for(int i=0;i<=100;i++) {
				if(i==50) {
				Racing.display(5);
				}
				else if(i==100) {
					Racing.racewin(5);
				}
				Random r=new Random();
				int q=r.nextInt(6);
				
			}	
			
		}
		

	 }
 class Thread6 extends Thread{
		public void run() {
			for(int i=0;i<=100;i++) {
				if(i==50) {
				Racing.display(6);
				}
				else if(i==100) {
					Racing.racewin(6);
				}
				Random r=new Random();
				int q=r.nextInt(6);
				
			}	
			
		}
		

	 }



