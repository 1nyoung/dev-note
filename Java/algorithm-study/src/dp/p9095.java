package dp;

import java.util.Scanner;

// 1, 2, 3 더하기
public class p9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int[] d = new int[12];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		for (int j = 4; j <= 10; j++) {
			d[j] = d[j - 1] + d[j - 2] + d[j - 3];
		}

		
		int cnt = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <= cnt; i++) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
	}
}
