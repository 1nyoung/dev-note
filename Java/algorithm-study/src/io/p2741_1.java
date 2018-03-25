package io;

import java.util.Scanner;

// N찍기
public class p2741_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=n; i++){
			sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}

// 빠른결과를 얻을 수 있음