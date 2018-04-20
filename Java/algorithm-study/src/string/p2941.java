package string;

import java.util.Scanner;

// 크로아티아알파벳
public class p2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String s = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=" , "0");
		
		System.out.println(s.length());
	}
}
