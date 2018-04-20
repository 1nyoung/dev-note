package string;

import java.util.Scanner;

// 아스키코드
public class p11654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		System.out.println((int)line.charAt(0));
		// 오답
		//System.out.println(line.charAt(0) -'0');
	}
}
