package string;

import java.util.Scanner;

// 단어공부
public class p1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toUpperCase();
		int[] ap = new int[26];
		int max = ap[0];
		char answer = '?';
		
		for(int i = 0; i<s.length(); i++){
			ap[s.charAt(i) - 'A'] ++;
			if(ap[s.charAt(i) - 'A'] > max){
				answer = s.charAt(i);
				max =ap[s.charAt(i) - 'A'];
			}else if(max == ap[s.charAt(i) - 'A']){
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}
