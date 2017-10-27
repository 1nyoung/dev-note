package hh;

import java.util.Scanner;

// 문자열 반복
public class s2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i ++){
			int n = sc.nextInt();
			String s = sc.next();
			sc.nextLine();
			
			for(int j=0; j<s.length(); j++ ){
				for(int k = 0; k<n; k++){
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
