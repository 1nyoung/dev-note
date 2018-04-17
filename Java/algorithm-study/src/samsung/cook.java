package samsung;

import java.util.ArrayList;
import java.util.Scanner;

public class cook {
	static int N;
	static ArrayList<Integer> A;
	static ArrayList<Integer> B;
	static int[] T;
	static int[][] map;
	static int[] scoreA;
	static int[] scoreB;
	static int totalA, totalB;
	static int ans = 100;
	static void bfs3(int v, int cnt){
		if(cnt==2){
			int AA = map[scoreA[0]][scoreA[1]] + map[scoreA[1]][scoreA[0]];
			int BB = map[scoreB[0]][scoreB[1]] + map[scoreB[1]][scoreB[0]];
			System.out.println(map[scoreA[0]][scoreA[1]] + " + " + map[scoreA[1]][scoreA[0]] );
			System.out.println(map[scoreB[0]][scoreB[1]] + " + " + map[scoreB[1]][scoreB[0]] );
			System.out.println("=======================");
//			System.out.println(Math.abs(AA-BB));
			ans = Math.min(ans, Math.abs(AA-BB));
			
		}else{
			for(int i = v+1; i< N/2; i ++ ){
				scoreB[1] = B.get(i);
				bfs3(i, cnt+1);
			}
		}
		
	}
	static void bfs2(int v, int cnt){
		if(cnt==2){
			for(int i = 0; i < N/2; i++){
				scoreB[0] = B.get(i);
				bfs3(i, 1);
			}
		}else{
			for(int i = v+1; i< N/2; i ++ ){
				scoreA[1] = A.get(i);
				bfs2(i, cnt +1);
			}
		}
	}
	
	static void cal(){
		scoreA = new int[N/2];
		scoreB = new int[N/2];
		
		for(int i =0; i<N/2; i++){
			scoreA[0] = A.get(i);
			bfs2(i, 1);
		}
	}
	
	static void dfs(int sa, int cnt){
		if(cnt == N/2){
			A = new ArrayList<Integer>();
			B = new ArrayList<Integer>();
			
//			for(int x :T){
//				System.out.print(x);
//			}
//			System.out.println();
			
			for(int i =0; i< N; i++){
				if(T[i] == 1){
					A.add(i);
				}
				if(T[i] == 0){
					B.add(i);
				}
			}
			cal();
		}else{
			for(int i = sa + 1; i<N; i++){
				T[i] = 1;
				dfs(i, cnt +1);
				T[i] = 0;
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		T = new int[N];
		
		for(int i = 0; i<N; i++){
			T[i] = 1;
			dfs(i, 1);
			T[i] = 0;
		}
		
		System.out.println(ans);
	}

}
