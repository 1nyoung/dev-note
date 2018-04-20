package array;

import java.util.Scanner;

// 배열 - OX
public class p8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		
		for(int i = 0; i<n; i++){
			String str = sc.next();
			int cnt = 0;
			for(int j=0; j<str.length(); j++){
				String answer = str.charAt(j) + "";

				if(answer.equals("O")){
					cnt ++;
					sum = sum + cnt;
				}else if(answer.equals("X")){
					cnt = 0;
				}
			}
			
			System.out.println(sum);
			sum= 0;
			cnt = 0;
		}
	}

}
