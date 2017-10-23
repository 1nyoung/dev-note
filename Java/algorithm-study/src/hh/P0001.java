package hh;

import java.util.Scanner;

public class P0001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T;
		int test_case;
		
		T = sc.nextInt();
		for (test_case = 1; test_case<=T; test_case++){
			
			int value_A, value_B;
			
			value_A = 0;
			value_B = 0;
			
			value_A = sc.nextInt();
			value_B = sc.nextInt();
			
			System.out.println("Case#" + test_case);
			System.out.println(value_A + value_B);
		}
	}
}
