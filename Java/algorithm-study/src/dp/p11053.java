package dp;

import java.util.Scanner;

// 가장 긴 증가하는 부분 수열
public class p11053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int [n+1];
		int[] d = new int[n+1];
		
		for(int i = 1; i<=n; i++){
			arr[i] = sc.nextInt();
		}
		
		d[1] = 1;

		
		for(int i = 2; i<=n; i++){
			if(arr[i]>arr[i-1]){
				//System.out.println("hi");
				d[i] = d[i-1] +1;
			}else{
				int cnt =1;
				for(int j=i; j>0; j--){
					if(arr[j]>arr[j-1]){
						cnt++;
						//System.out.println(cnt);
					}else{
						break;
					}
				}
				d[i] = Math.max(d[i-1], cnt);
			}
		}
		System.out.println(d[n]);
	}
}
