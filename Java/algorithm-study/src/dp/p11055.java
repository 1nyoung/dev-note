package dp;

import java.util.Scanner;

// 가장 큰 증가 부분 수열
public class p11055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int [n+1];
		int[] d = new int[n+1];
		
		for(int i = 1; i<=n; i++){
			arr[i] = sc.nextInt();
		}
		
		d[1] = arr[1];

		
		for(int i = 2; i<=n; i++){
			int sum = 0;
			
			for(int j=i; j>0; j--){
				if(arr[i]>=arr[j]){
					sum += arr[j];
				}
			}

			d[i] = Math.max(d[i-1], sum);
		}

		System.out.println(d[n]);	
	}
}
