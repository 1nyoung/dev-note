package search;

import java.util.Scanner;

// 부분집합의 합 - dfs
public class p1182 {
	static int N, S, val[], cnt, sum;
	
	static void dfs(int current){
		if(current == N){
			System.out.println("리턴");
			return;
		}

		if(sum + val[current] == S){
			cnt ++;
		}

		dfs(current+1);
		
		sum = sum + val[current];
		dfs(current+1);
		
		// 백트래킹
		sum = sum - val[current];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		
		val = new int[N];
		
		for(int i= 0; i<N; i ++){
			val[i] = sc.nextInt();
		}
		
		dfs(0);
		//System.out.println(cnt);
	}
}
