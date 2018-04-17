package samsung;

import java.util.Scanner;

// 연구소
public class p14502 {
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int N, M, ans;
	static int[][] map, temp;

	static void wall(int v, int cnt) {

		// 복사 이거 안해서 자꾸,,,
		if (cnt == 3) {
			temp = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					temp[i][j] = map[i][j];
				}
			}

			// 퍼트리기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (temp[i][j] == 2) {
						spread(i, j);
					}
				}
			}
			// 안전영역 갯수세기
			cal();
		} else {
			for (int i = v + 1; i < N * M; i++) {
				int ny = (int) i / M;
				int nx = i % M;
				if (map[ny][nx] == 0) {
					map[ny][nx] = 1;
					wall(i, cnt + 1);
					map[ny][nx] = 0;
				}
			}
		}
	}

	static void spread(int y, int x) {

		// 상하좌우
		for (int k = 0; k < 4; k++) {
			int ny = dy[k] + y;
			int nx = dx[k] + x;

			// 상하좌우가 0이면 바이러스 감염
			if (ny >= 0 && ny < N && nx >= 0 && nx < M) {
				if (temp[ny][nx] == 0) {
					temp[ny][nx] = 3;
					spread(ny, nx);
				}
			}
		}
	}

	static void cal() {
		int safe = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (temp[i][j] == 0) {
					++safe;
				}
			}
		}

		if(safe > ans){
			ans = safe;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		// 벽세우기
		for (int i = 0; i < N * M; i++) {
			int ny = (int) i / M;
			int nx = i % M;

			// 0일 경우
			if (map[ny][nx] == 0) {

				map[ny][nx] = 1;

				// wall dfs 시작
				wall(i, 1);
				
				// 백트래킹
				map[ny][nx] = 0;
			}
		}
		System.out.println(ans);
	}
}
