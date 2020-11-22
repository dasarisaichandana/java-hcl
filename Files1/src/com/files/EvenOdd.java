package com.files;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class EvenOdd {
	
	public static void main(String[] args) throws IOException {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter no of values");
			int n = s.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			FileOutputStream fo = new FileOutputStream("evennumber.txt");
			FileOutputStream fo1 = new FileOutputStream("oddnumber.txt");
			String a="";
			String b="";
			for (int i = 0; i < n; i++) {
				if (arr[i] % 2 == 0) {
					try {
						a = a+arr[i];
						byte c[]=a.getBytes();
						fo.write(c);
						a="";
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					b = b+arr[i];
					byte d[]=b.getBytes();
					fo1.write(d);
					b="";
				}
			}
			fo1.close();
			fo1.close();
		

	}


}
