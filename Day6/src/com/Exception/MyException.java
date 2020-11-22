package com.Exception;

public class MyException extends RuntimeException {
	public MyException(String m) {
		super(m);
		System.out.println(m);
	}

}
