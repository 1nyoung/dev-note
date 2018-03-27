package dp;

import java.util.Arrays;
import java.util.Scanner;

// 포도주 시식
public class p2156 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int amount[] = new int[n+1];
		int dp[] = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			amount[i] = sc.nextInt();
		}
		
		dp[1]=amount[1];
		if(n>1)
			dp[2]=amount[1]+amount[2];
		
		for(int i=3;i<=n;i++) {
			dp[i]=Math.max(dp[i-1], Math.max(dp[i-2]+amount[i], dp[i-3]+amount[i]+amount[i-1]));
		}
		System.out.println(dp[n]);
	}
}
