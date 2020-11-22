package com.Exception;

public class CreateMain {

	public static void main(String[] args) {
		try {
			throw new Exception("somethig");
		}catch(Exception e) {
			
			
		}
		finally {
			System.out.println("you were there");
		}

	}
	public CreateMain(String message) {
		System.out.println(message);
	}
	

}
