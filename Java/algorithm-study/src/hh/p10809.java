package hh;

import java.util.Scanner;

// 알파벳 찾기
public class p10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int[] alpha = new int[26];
		
		for (int i = 0; i < alpha.length; i ++){
			alpha[i] = -1;
		}
		for(int i = 0; i < str.length(); i++){
			if(alpha[str.charAt(i)-'a'] == -1){
				alpha[str.charAt(i)-'a'] = i;
			}
		}
		
		for(int x: alpha){
			System.out.print(x + " ");
		}
	}
}
