package dp;

import java.util.Scanner;

public class fobonacci_BU {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] d = new int[100];
		d[0] = 0;
		d[1] = 1;
		
		for(int i=2; i<=n; i++){
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[n]);

	}
}
