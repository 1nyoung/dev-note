package io;

import java.util.Scanner;
import java.util.StringTokenizer;

// A+B - 6
public class p10953 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			String s = sc.next();
			String temp[] = s.split(",");
			
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			
			System.out.println(a + b);
		}
	}
}
