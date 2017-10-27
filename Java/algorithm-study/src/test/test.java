package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i< num; i ++){
			int r = sc.nextInt();
			String l = sc.next();
			System.out.println(r + " " + l);
		}
	}

}
