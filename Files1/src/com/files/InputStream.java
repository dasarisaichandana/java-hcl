package com.files;
import java.util.Scanner;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		FileInputStream fis=null;
		//String s=sc.nextLine();
		
		try {
			fis=new FileInputStream("C:\\Program Files\\Java\\jdk1.8.0_251\\qss otepad.txt");
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}
