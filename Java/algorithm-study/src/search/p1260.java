package search;

import java.util.*;

// bfs & dfs
public class p1260 {
	static ArrayList<Integer>[] a;
	static boolean[] c;

	public static void dfs(int x) {
		if (c[x]) {
			return;
		}
		
		c[x] = true;
		
		System.out.print(x + " ");
		//System.out.println("-------------"+x);
		
		for (int y : a[x]) {
			//System.out.println(y);
			if (c[y] == false) {
				dfs(y);
			}
		}
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		c[start] = true;
		while (!q.isEmpty()) {
			int x = q.remove();
			
			//System.out.print(x + " ");
			System.out.println(x + " ");
			for (int y : a[x]) {
				System.out.println("검사" + y);
				if (c[y] == false) {
					System.out.println("큐");
					c[y] = true;
					q.add(y);
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();

		//ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		a = new ArrayList[n + 1];
		
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u);
		}
		
		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}
		
		c = new boolean[n + 1];
		dfs(start);
		System.out.println();
		
		c = new boolean[n + 1];
		bfs(start);
		System.out.println();
	}
}
