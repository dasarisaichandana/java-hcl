package com.Thread;



class Runnable3 implements Runnable {


	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i==50) {
		       Racing2.display(1);
				
			}
			
			else if ( i==100) {
			Racing2.racewin(1);
		}
		
		
	}
		
		
	}
}
class Runnable4 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i==50) {
		       Racing2.display(2);
				
			}
			
			else if ( i==100) {
			Racing2.racewin(2);
		}
		
		
	}
		
	}
	
}
class Runnable5 implements Runnable {


	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i==50) {
		       Racing2.display(3);
				
			}
			
			else if ( i==100) {
			Racing2.racewin(3);
		}
		
		
	}
		
		
	}
}
class Runnable6 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i==50) {
		       Racing2.display(4);
				
			}
			
			else if ( i==100) {
			Racing2.racewin(4);
		}
		
		
	}
		
	}
	
}
class Runnable7 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i==50) {
		       Racing2.display(5);
				
			}
			
			else if ( i==100) {
			Racing2.racewin(5);
		}
		
		
	}
		
	}
	
}




