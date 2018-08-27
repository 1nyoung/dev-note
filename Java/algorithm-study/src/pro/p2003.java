package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 수들의 합2
public class p2003 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// N개 수열, 목표값 M
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 배열
		int[] arr = new int[N+1];
		int right = 0, sum = 0, cnt = 0;
		
		// 배열 삽입
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i<=N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i =1; i<=N; i++) {
			// i부터 right 값을 더해감
			while(right<N&&sum<M) {
				sum+=arr[++right];
			}
				
			if(sum==M) {
				cnt ++;
			}
			
			// sum이 M보다 크다면 i+1값을 첫번째로
			sum -= arr[i];
		}
		System.out.println(cnt);
	}
}
