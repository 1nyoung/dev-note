package dp;

import java.util.Scanner;

// LCS
public class p9251 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int[][] d = new int[a.length()+1][b.length()+1];
		
		for(int i = 1; i<=a.length(); i++){
			for(int j=1; j<=b.length();j++){
				if(a.charAt(i-1) == b.charAt(j-1)){
					d[i][j] = d[i-1][j-1] + 1;
				}else{
					d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
				}
			}
		}
		System.out.println(d[a.length()][b.length()]);
	}
}
