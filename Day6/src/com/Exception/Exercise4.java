package com.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InvalidObjectException;



public class Exercise4 {

	public static void main(String[] args) {

		int n=10;
		int[] v = new int[n];
		BufferedReader in=null;

		

		FileReader f = null;
		try {
			 f = new FileReader("dati.txt");
			try {
			 in = new BufferedReader(f);
			}
		catch (Exception e1) {
			System.out.println("data.txt file not exist");
			e1.printStackTrace();
		}
		}
		catch(Exception e) {
			System.out.println("FilenotFoundException");
		}
	

	finally {	

		int i=0;
		 

		
	try {
			String linea = in.readLine();
			}
	catch(Exception e) {
		System.out.println("IOexception");
		e.printStackTrace();
	}
			
		try {
			String linea=null;
			
			while (linea!=null) {
		

				v[i] = Integer.parseInt(linea);

				linea = in.readLine();

				i++;
			}
		}
		catch (Exception e) {
       System.out.println("ArrayOutOfBoundException");
			
			e.printStackTrace();
	

		}
		try {
			f.close();
			
		} catch (Exception e) {
			//System.out.println("FileNotFoundException");
			e.printStackTrace();
		}
		}
	}
}
		

		

		 

	


