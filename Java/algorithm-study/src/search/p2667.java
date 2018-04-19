package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 단지번호붙이기
public class p2667 {

	static int N;
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int[][] map;
	static int number;

	static void dfs(int y, int x) {
		int ny, nx;

		for (int i = 0; i < 4; i++) {
			ny = y + dy[i];
			nx = x + dx[i];

			if (ny < 0 || ny >= N || nx < 0 || nx >= N)
				continue;
			if (map[ny][nx] == 1) {
				map[ny][nx] = number;
				dfs(ny, nx);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		// for(int i = 0; i<N; i++){
		// for(int j = 0; j<N; j++){
		// map[i][j] = sc.nextInt();
		// }
		// }

		number = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					++number;
					map[i][j] = number;
					dfs(i, j);

				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(number - 1);

		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;

		for (int i = number; i > 1; i--) {

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (map[j][k] == i) {
						cnt++;
					}
				}
			}

			list.add(cnt);
			cnt = 0;
		}

		Collections.sort(list);

		for (int x : list) {
			System.out.println(x);
		}

	}

}
