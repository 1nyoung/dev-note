package io;
import java.util.Scanner;

// A+B - 3
public class p10950 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);	
		}
	}
}