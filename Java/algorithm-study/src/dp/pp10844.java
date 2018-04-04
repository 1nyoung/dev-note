package dp;

import java.util.Scanner;

public class pp10844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] d = new int[n+1];
		
		d[1] = 9;
		d[2] = 17;
		
		for(int i = 1; i<= n; i++){
			d[i] = d[i-1] * 2 - 2;
		}
		
		System.out.println(d[n]);
	}
}
