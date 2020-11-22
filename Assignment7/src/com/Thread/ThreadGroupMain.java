package com.Thread;

public class ThreadGroupMain {

	public static void main(String[] args) {
		
		
		Runnable3 runnable3 = new Runnable3(); 
		Runnable4 runnable4=new Runnable4();
		Runnable5 runnable5 = new Runnable5(); 
		Runnable6 runnable6=new Runnable6();
		Runnable7 runnable7=new Runnable7();
		
		
        ThreadGroup tg1 = new ThreadGroup("Velocity");  
         
        Thread t1 = new Thread(tg1, runnable3,"one");  
        t1.start();  
        Thread t2 = new Thread(tg1, runnable4,"two");  
        t2.start();  
        Thread t3 = new Thread(tg1, runnable5,"three");  
        t3.start();
        Thread t4 = new Thread(tg1, runnable6,"four");  
        t4.start();  
        Thread t5 = new Thread(tg1, runnable7,"five");  
        t5.start();
        System.out.println("Thread Group Name: "+tg1.getName()); 
        tg1.list();
		
	
        
        Runnable8 runnable8 = new Runnable8(); 
		Runnable9 runnable9=    new Runnable9();
		Runnable10 runnable10 = new Runnable10(); 
		Runnable11 runnable11=  new Runnable11();
		Runnable12 runnable12= new Runnable12();
        
       
		
        ThreadGroup tg2 = new ThreadGroup("java dalias");  
        
		
        Thread t6 = new Thread(tg2, runnable8,"one");  
        t6.start();  
        Thread t7 = new Thread(tg2, runnable9,"two");  
        t7.start();  
        Thread t8 = new Thread(tg2, runnable10,"three");  
        t8.start();
        Thread t9 = new Thread(tg2, runnable11,"four");  
        t9.start();  
        Thread t10 = new Thread(tg2, runnable12,"five");  
        t10.start();
        System.out.println("Thread Group Name: "+tg2.getName()); 
        tg2.list();    

        
        
        
        

	}
	

}
