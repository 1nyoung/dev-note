package dp;

import java.util.Arrays;
import java.util.Scanner;

public class p55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int[] d = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			d[i] = arr[i];
			for (int j = 1; j < i; j++) {
				if (arr[i] > arr[j] && d[i]< d[j]+arr[i]) {
					d[i] = d[j] + arr[i];
				}
				for (int x : d) {
					System.out.print(x + " " );
				}
				System.out.println();
			}
		}

		Arrays.sort(d);
		System.out.println(d[n]);
	}
}
