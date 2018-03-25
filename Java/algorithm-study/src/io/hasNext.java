package io;

import java.util.Scanner;

public class hasNext {
	public static void main(String[] args) {
		Scanner s = new Scanner("\n\n\n가나다\n\n라\n\n");
		
		while(s.hasNext()){
			String str = s.nextLine();
			System.out.println("출력:"+str); 
		}
	}
}
