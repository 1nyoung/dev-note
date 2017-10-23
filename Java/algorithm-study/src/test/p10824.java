package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 네수
public class p10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = bf.readLine().split(" ");
		String a = line[0] + line[1];
		String b = line[2] + line[3];
		int ans2 = Integer.parseInt(a) + Integer.parseInt(b);
		//long ans = Long.valueOf(a) + Long.valueOf(b);
		System.out.println(ans2);
	}
}

//BufferedReader는 read와 readLine만 이기 때문에, 정수는 파싱을 해야 한다