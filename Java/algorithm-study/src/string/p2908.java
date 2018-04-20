package string;

import java.util.Scanner;

// 문자열 - 상수
public class p2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		String[] temp = line.split(" ");
		String A = temp[0];
		String B = temp[1];
		
		String NA =(A.charAt(2) + "") + (A.charAt(1) + "")+ (A.charAt(0) + "");
		String NB =(B.charAt(2) + "") + (B.charAt(1) + "")+ (B.charAt(0) + "");
		
		int a = Integer.parseInt(NA);
		int b = Integer.parseInt(NB);
		
		if(a>b){
			System.out.println(a);
		}else{
			System.out.println(b);
		}
	}
}
