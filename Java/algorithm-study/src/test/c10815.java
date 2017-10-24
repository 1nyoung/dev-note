package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

// 숫자 카드 - HashSet
public class c10815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();

		HashSet<Integer> d = new HashSet<Integer>();
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());

		while(st.hasMoreTokens()){
			int num = Integer.parseInt(st.nextToken());
			d.add(num);
		}
		
		int m = sc.nextInt();
		sc.nextLine();

		st = new StringTokenizer(sc.nextLine());

		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()){
			int num = Integer.parseInt(st.nextToken());
			if(d.contains(num)){
				sb.append("1 ");
			} else{
				sb.append("0 ");
			}
		}
		
		System.out.println(sb);
	}

}
