package search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 숨바꼭질
// 완전탐색 - bfs
public class p1697 {
	public static void bfs(int start, int end) {
		int[] c = new int[100001];
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		c[start] = 1;
		
		while (!q.isEmpty()) {
			int x = q.remove();
			if( x == end){
				System.out.println(x);
				System.out.println(c[x]-1);
				return;
			}else{
				if( x-1>= 0 && c[x-1] == 0){
					System.out.println(x-1);
					q.add(x -1);
					c[x-1] = c[x] + 1;
				}
				if( x+1 <= 100000 && c[x+1] == 0){
					System.out.println(x+1);
					q.add(x+1);
					c[x+1] = c[x] + 1;
				}
				if( x*2 <= 100000 && c[x*2] == 0){
					System.out.println(x*2);
					q.add(x *2);
					c[x* 2] = c[x] + 1;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		bfs(n, m);
	}
}
