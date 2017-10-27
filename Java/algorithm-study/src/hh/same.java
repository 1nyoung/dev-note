package hh;

import java.util.Arrays;
import java.util.Scanner;

public class same {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		String[] str = line.split(" ");
		String a = str[0];
		String b = str[1];
		
		int[] alpha_A = new int[26];
		int[] alpha_B = new int[26];

		for(int i = 0; i < a.length(); i ++){
			alpha_A[a.charAt(i)-'a'] ++;
		}
		
		for(int i = 0; i < b.length(); i ++){
			alpha_B[b.charAt(i)-'a'] ++;
		}
		
		System.out.println(Arrays.equals(alpha_A,alpha_B));
	}

}
