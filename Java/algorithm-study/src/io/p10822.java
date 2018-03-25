package io;

import java.util.Scanner;

// 더하기
public class p10822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] str = line.split(",");
		int sum = 0;
		for(int i = 0; i <str.length; i ++){
			sum += Integer.parseInt(str[i].trim());
		}
		System.out.println(sum);
	}
}
