package com.ifelse;
import java.util.Scanner;

public class Digitsum {
	int num;
	int sum = 0 ;
	
	public Digitsum(int num) {
		this.num = num ; 
	}
	
	public void SumOfDigit() {

	        while ( num != 0){
	            int R = num % 10 ;
	            sum = sum + R ;
	            num = num / 10 ;
	        }
	        System.out.println("Sum is : " + sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		Digitsum d = new Digitsum(num);
		d.SumOfDigit();
		sc.close();
	}

}
