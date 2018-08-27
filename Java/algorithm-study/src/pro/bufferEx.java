package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bufferEx {

	public static void main(String[] args) throws IOException {
		
		//  버퍼 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열 받을때
		String str = br.readLine();
		System.out.println(str);
		
//		// 숫자만 받을때
//		int num = Integer.parseInt(br.readLine());
//		
//		// 연속되는 숫자 받을때
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		// 연속되는 숫자를 배열에 넣을때
//		int[] arr = new int[n+1];
//		st = new StringTokenizer(br.readLine());
//		
//		for(int i= 1; i<n+1; i++){
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		for(int x : arr) {
//			System.out.println(x);
//		}
	}

}
