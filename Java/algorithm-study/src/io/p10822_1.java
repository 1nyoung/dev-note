package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 더하기
public class p10822_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line, ",");
		int sum = 0;
		while(st.hasMoreTokens()){
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
	}
}
