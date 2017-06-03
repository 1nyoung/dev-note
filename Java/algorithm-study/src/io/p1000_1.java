package io;

import java.util.Scanner;

// A+B
public class p1000_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		
		for (int i = 2; i <= n; i++) {
			if (i % 3 == 0 && d[i / 3] <= d[i - 1]) {
				d[i] = d[i / 3] + 1;
			} else if (i % 2 == 0 && d[i / 2] <= d[i - 1]) {
				d[i] = d[i / 2] + 1;
			} else {
				d[i] = d[i - 1] + 1;
			}
			System.out.println(d[i]);
		}
		System.out.println(d[n]);
	}
}
