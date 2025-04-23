package com.ifelse;
import java.util.Scanner;

public class Adult {
	int age;
	public  void adlt (int age) {
		this.age = age;
		
		if (age >= 18 ) {
			System.out.println("Adult");
		}else {
			System.out.println("Under age");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AGE : ");
		int age = sc.nextInt();
		
		Adult a = new Adult();
		a.adlt(age);
		sc.close();
	
		
		
	}

}
