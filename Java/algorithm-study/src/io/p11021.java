package io;

import java.util.Scanner;

// A+B - 7
public class p11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 0; i<count; i ++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			
			System.out.println("Case  #"+ i + ":   "+ c);
		}

	}

}
