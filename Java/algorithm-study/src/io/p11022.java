package io;

import java.util.Scanner;

// A+B - 8
public class p11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i = 1 ; i <= cnt ; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			
			System.out.println("Case #"+ i + ": "+ a + " + " + b +" = " + c);
		}
	}
}
