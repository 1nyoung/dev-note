package hh;

import java.util.Scanner;

// 그룹 단어 체커
public class s1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] alpha = new int[26];
		
		for(int i = 0; i < num; i ++){
			String s = sc.next();
			
			alpha[s.charAt(i)-'a']++;
			
		}
	}
}
