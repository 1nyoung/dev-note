package io;

import java.util.Scanner;

// 숫자의 합
public class p11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = sc.nextInt();
		String str = sc.next();

		for(int i = 0; i<cnt; i++){
			sum += str.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
