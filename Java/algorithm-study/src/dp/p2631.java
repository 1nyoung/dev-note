package dp;

import java.util.Arrays;
import java.util.Scanner;

// 줄세우기
public class p2631 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int [n+1];
		int[] d = new int[n+1];
		
		for(int i = 1; i<=n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i<=n; i++){
			d[i] =1;
			for(int j=1; j<i; j++){
				if(arr[i] > arr[j] && d[i]<= d[j]){
					d[i] = d[j] +1;
				}
			}
		}
		Arrays.sort(d);
		System.out.println(n - d[n]);
	}
}
