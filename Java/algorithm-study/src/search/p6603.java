package search;

import java.util.ArrayList;
import java.util.Scanner;

// 로또
public class p6603 {
	static int N;
	static int[] arr;
	static ArrayList<Integer> list;

	static void dfs(int v, int cnt) {
		if (cnt == 6) {
			for (int x : list) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for (int i = v + 1; i < N; i++) {
				list.add(arr[i]);
				dfs(i, cnt + 1);
				list.remove(cnt);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while ((N = sc.nextInt()) != 0) {

			arr = new int[N];
			list = new ArrayList<Integer>();

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < N; i++) {
				list.add(arr[i]);
				dfs(i, 1);
				list.remove(0);
			}
			System.out.println();
		}
	}
}
