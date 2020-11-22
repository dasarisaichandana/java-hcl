package com.Main;

import com.Arith.ArithmeticClass;
import com.Bit.BitWise;
import com.inc.Increement;
import com.rel.Relational;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String choice =s.next();
	
		switch(choice) {
		case "arithmetic":
			ArithmeticClass a=new ArithmeticClass();
				System.out.println(a.add(12, 13));
				System.out.println(a.sub(13, 14));
				System.out.println(a.div(13, 14));
				System.out.println(a.mul(13, 14));
				System.out.println(a.modular(13, 14));
		case "relational":
			Relational b=new Relational();
			System.out.println(b.greater(12, 13));
			System.out.println(b.less(13, 14));
			System.out.println(b.greaterThan(13, 14));
			System.out.println(b.lessthan(13, 14));
		case "Increment":
			Increement in=new Increement();
			System.out.println(in.inc(12, 13));
			System.out.println(in.dec(13, 14));
		case "bitwise":
			BitWise bi=new BitWise();
			System.out.println(bi.equal(13, 14));
			bi.and(12, 14);
			bi.or(14, 24);
		
			
}
	
	}
}
