package test;

import java.util.Scanner;

public class p0328 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i<N; i ++){
			sum += arr[i];
		}

		System.out.print(sum);
	}
}
