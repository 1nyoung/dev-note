package test;

import java.util.Scanner;

// 더하기3
public class p11023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int sum = 0;
		
		while(sc.hasNextInt()){
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
}
