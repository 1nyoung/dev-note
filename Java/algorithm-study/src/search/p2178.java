package search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int y;
	int x;
	
	Point(int y, int x){
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}
}


// 미로탐색
public class p2178 {
	static int N, M;
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int[][] map;
	static boolean[][] visit;
	static Queue<Point> q = new LinkedList<>();
	static int[][] depth;
	
	public static void bfs(int y, int x) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(y, x));

		while (!q.isEmpty()) {
			Point p = q.remove();
			
			y = p.getY();
			x = p.getX();
			
			if(y == N-1 && x == M-1) return;
			
			for(int i = 0; i< 4; i++){
				int ny = dy[i] + y;
				int nx = dx[i] + x;
				 
				if (ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
				if(visit[ny][nx])continue;
				if(map[ny][nx] == 1){
					visit[ny][ny] = true;
					depth[ny][nx] = depth[y][x] +1;
					q.add(new Point(ny, nx));	
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
//		long start = System.currentTimeMillis();

	
		map = new int[N][M];
		visit = new boolean[N][M];
		depth = new int[N][M];

		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		
		depth[0][0] = 1;
		visit[0][0] = true;
		bfs(0,0);
		System.out.println(depth[N-1][M-1]);
		
//		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
//		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");

		
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}


