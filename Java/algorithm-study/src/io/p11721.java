package io;

import java.util.Scanner;

// 열 개씩 끊어 출력하기
public class p11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String se = sc.nextLine();
		
		for(int i = 0; i < se.length(); i++){
			System.out.print(se.charAt(i));
			if(i%10 == 9){
				System.out.println();
			}
		}
	}
}
