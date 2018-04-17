package samsung;

import java.util.Scanner;

// 테트로미노
// 2차원배열 탐색 - dfs + 시뮬레이션
public class p14500 {
	static int N, M, ans;
	static int[][] map = new int[501][501];
	static boolean[][] visit = new boolean[501][501];
	
	// 상, 하, 좌, 우
	static int[] dy = { -1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
	
	// ㅗ모양 모든 회전 방향
	static int exception(int y, int x){
		int result = 0;
		
		// 모든 좌표 돌때 모양 나오는것만 시뮬레이션 가능
		if(y-1>=0 && x-1>=0 && x+1<M){ // ㅗ
			result = Math.max(map[y-1][x]+map[y][x-1]+map[y][x]+map[y][x+1], result);
		}
		if(y-1>=0 && x+1<M && y+1<N){ // ㅏ
			result = Math.max(map[y-1][x]+map[y][x]+map[y][x+1]+map[y+1][x], result);
		}
		if(x-1>=0 && x+1 < M && y+1 < N){ // ㅜ 
			result = Math.max(map[y][x-1]+map[y][x]+map[y][x+1]+map[y+1][x], result);
		}
		if(x-1>=0 && y-1 >= 0 && y+1 < N){ // ㅓ
			result = Math.max(map[y][x-1]+map[y][x]+map[y-1][x]+map[y+1][x], result);
		}
		return result;
	}
	
	static void dfs(int y, int x, int cnt, int total){
		int ny, nx;
		
		// 최대 4까지 깊이
		if(cnt == 4){
			// 토탈값을 기존의 최댓값과 다시 비교
			ans = Math.max(ans, total);
			return;
		}
		
		// 상하좌우 탐색
		for(int i=0; i<4; i++){
			ny = y + dy[i];
			nx = x + dx[i];
			
			// 예외상황일 경우 건너뛰기
			if(ny<0 || nx<0 || ny>= N || nx>=M) continue;
			if(visit[ny][nx]) continue;
			
			// 방문표시 후 기존 값에 좌표값 더하기 3번더 반복
			visit[ny][nx]=true;
			dfs(ny, nx, cnt+1,total+map[ny][nx]);
			
			// 최대 깊이까지 가고난 후 cnt -- 되면서 각각 백트래킹
			visit[ny][nx]=false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				map[i][j]= sc.nextInt();
			}
		}
		
		// 모든좌표
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				visit[i][j] = true;
				dfs(i, j, 1, map[i][j]);
				// 백트래킹
				visit[i][j]= false;
				
				// 모든 좌표 ㅗ 경우의수 
				ans = Math.max(ans, exception(i, j));
			}
		}
		System.out.println(ans);
	}
}
