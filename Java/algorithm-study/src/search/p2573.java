package search;

import java.util.Scanner;

// 빙산
// 2차원배열 탐색 - dfs
public class p2573 {
	static int N, M;
	static int[][] map, temp;
	static boolean[][] visit;
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
	static int component;

	static void melt(){
		
		// 전체위치
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(map[i][j] != 0){
					
					// 상하좌우
					for(int k=0; k<4; k++){
						int ny = dy[k] + i;
						int nx = dx[k] + j;
						
						// 0갯수만큼
						if(map[ny][nx] == 0){
							temp[i][j] = temp[i][j] - 1;
							
							// 음수는 0으로
							if(temp[i][j]<0){
								temp[i][j] = 0;
							}
						}
					}		
				}
			}
		}
		
		// 기존배열에 덮어쓰기 
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				map[i][j] = temp[i][j];
			}
		}
		
	}
	
	static int check() {
		component = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visit[i][j] && map[i][j] > 0) {
					++component;
					dfs(i, j);
				}
			}
		}
		return component;
	}

	
	static void dfs(int y, int x){
		visit[y][x] = true;
		
		for(int i = 0; i<4; i++){
			int ny = dy[i] + y;
			int nx = dx[i] + x;
			
			if( ny >= 0 && ny < N && nx>=0 && nx < M){
				if(!visit[ny][nx] && map[ny][nx] > 0){
					dfs(ny, nx);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		temp = new int[N][M];
		visit = new boolean[N][M];
				
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				temp[i][j] = map[i][j] = sc.nextInt();
			}
		}
		
		int tmp = 0;
		int ans = 0;
		while((tmp = check()) < 2){
			if(tmp == 0){
				ans = 0;
				break;
			}
			++ans;
			visit = new boolean[N][M];
			melt();
		}
		System.out.println(ans);
		


		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
	}
}
