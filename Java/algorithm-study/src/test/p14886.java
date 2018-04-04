package test;

import java.util.Scanner;

// 스타트와 링크
public class p14886 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] d = new int[n+1][n+1];
		
		for(int i =1; i<= n;  i ++){			
			for(int j = 1; j<=n; j++){
				d[i][j] = sc.nextInt();
			}			
		}
		
			
		System.out.println(d[3][1]);

	}

}
