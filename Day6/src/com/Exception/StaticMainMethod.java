package com.Exception;
import java.util.Scanner;

//import com.Understanding.StaticMethods2;
public class StaticMainMethod {
	

	public static void main(String[] args) {
	// TODO Auto-generated method stub
				StaticMethods2 q=new StaticMethods2();
				Scanner s=new Scanner(System.in);
				
				String a;
				System.out.println("enter a file name ");
				a=s.next();
				System.out.println("File existing or not");
				System.out.println(q.fileExists(a));
				
				System.out.println("enter a string");
				String s1;
				s1=s.next();
				System.out.println("whether given string is a number or not ");
				System.out.println(q.isInt(s1));
				System.out.println("whether given string is real number or not ");
				System.out.println(q.isDouble(s1));
			}

		


	}


