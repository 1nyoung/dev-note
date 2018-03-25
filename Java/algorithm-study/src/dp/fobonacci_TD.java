package dp;

import java.util.Scanner;

public class fobonacci_TD {
	
	public static int fibonacci(int n){
		int[] memo = new int[100];
		if(n<=1){
			return n;
		}else{
//			if(memo[n]>0){
//				return memo[n];
//			}
			memo[n] = fibonacci(n-1) + fibonacci(n-2);
			return memo[n];
			//System.out.println(memo[n]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
	}

}
