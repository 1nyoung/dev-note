package samsung;

import java.util.Scanner;

// 로봇 청소기
public class p14503 {
	static int N, M, cnt, rr;
	static int[] robot = {0, 0, 0};
	static int[][] map;
	static boolean[][] visit;
	
	// 북 동 남 서의 왼쪽 방향
	static int[] dy = { 0, -1, 0, 1};
	static int[] dx = { -1, 0, 1, 0};
	
	// 북 동 남 서의 뒤쪽 방향
	static int[] by = { 1, 0, -1, 0};
	static int[] bx = { 0, -1, 0, 1};
	
	
	static void clean01(int y, int x, int d){
		rr = 0;
		if(map[y][x] == 0 && visit[y][x] == false){
			visit[y][x] = true;
			cnt ++;
		}
		clean02(y, x, d);
	}
	
	static void clean02(int y, int x, int d){
		int ny = dy[d] + y;
		int nx = dx[d] + x;
		
		// 2-1 청소할 공간이 있다면
		if(map[ny][nx] == 0 && visit[ny][nx] == false){
			clean01(ny, nx, rotate(d));

		} else{
			// 한바퀴 돌았을 경우
			if(rr == 4){
				rr = 0;
				// 뒤쪽방향 좌표
				int nny = by[d] +y;
				int nnx = bx[d] +x;
				
				// 2-4
				if(map[nny][nnx] == 1){
					return;
				}
				
				// 2-3
				clean02(nny, nnx, d);
				
			// 2-2	
			}else{
				rr++;
				clean02(y, x, rotate(d));
			}
		}
	}
	// 왼쪽으로 회전
	static int rotate(int d){
		if(d == 0){
			d = 3;
		}
		else if(d == 1){
			d = 0;
		}
		else if(d == 2){
			d = 1;
		}
		else if(d == 3){
			d = 2;
		}
		return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		N = sc.nextInt();
		M = sc.nextInt();
		
		robot[0] = sc.nextInt();
		robot[1] = sc.nextInt();
		robot[2] = sc.nextInt();
		
		map = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i =0; i <N; i++){
			for(int j = 0; j<M; j++){
				map[i][j] = sc.nextInt();
			}
		}
		clean01(robot[0], robot[1], robot[2]);
		System.out.println(cnt);
	}
}
