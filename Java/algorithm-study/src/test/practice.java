package test;

import java.util.Scanner;

public class practice {
	static int n;
	
	static int hi() {
		n ++;
		return n;
	}

	public static void main(String[] args) {
		int temp;
		while(hi() < 3 ){
			System.out.println(n);
		}
	}
}
