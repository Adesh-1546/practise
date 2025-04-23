package com.ifelse;
import java.util.Scanner;

public class PosNeg {
	int num;
	
	public void posnegv(int num) {
		this.num=num;
		
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0 ) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		PosNeg p = new PosNeg();
		p.posnegv(num);
		sc.close();
		
	}
	
}
