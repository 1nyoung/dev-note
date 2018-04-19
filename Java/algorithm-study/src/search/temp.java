package search;

import java.util.Scanner;

public class temp {
	static int N;
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int[][] map;

	static void dfs(int y, int x) {
		int ny, nx;

		for (int i = 0; i < 4; i++) {
			ny = y + dy[i];
			nx = x + dx[i];

			if (ny > 0 || ny < N || nx > 0 || nx > N)
				continue;
			if (map[ny][nx] == 1) {
				map[ny][nx] = 3;
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

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					map[i][j] = 3;
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
	}

}
