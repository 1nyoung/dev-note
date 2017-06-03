package dp;

import java.util.Scanner;

// 쉬운 계단 수
public class p10844 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] d = new long[n+1][10];
        
        for(int i = 1; i<=9; i++){
        	d[1][i] = 1;
        }
        
        for(int i = 2; i<=9; i++){
        	for(int j=0; j<n; j++){
        		
        		d[i][j] = 0;
        		
        		if(j-1 >= 0) {
        			d[i][j] += d[i-1][j-1];
        		}
        		if(j+1 <= 9) {
        			d[i][j] += d[i-1][j+1];
        		}
        		
        		d[i][j] %= 1000000000;
        	}
        }
        
        long ans = 0;
        for(int i=0; i<=9; i ++){
        	ans += d[n][i];
        }
		
        ans %= 1000000000;
        
        System.out.println(ans);

	}

}
