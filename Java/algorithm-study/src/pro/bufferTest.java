package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bufferTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 틀린코드
//		int a, b = Integer.parseInt(br.readLine());
		
		// 1 2
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
		
//		// 1
//		// 2
//		int a = Integer.parseInt(br.readLine());
//		int b = Integer.parseInt(br.readLine());
//		System.out.println(a+ b);
		
//		======================================
		
		int sum = 0;
		while(st.hasMoreTokens()){
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
		

	}

}
