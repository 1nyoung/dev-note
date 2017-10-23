package test;

import java.util.Scanner;

public class hasNextInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			System.out.println("hasNextInt()");
			int i = sc.nextInt();
			System.out.println(i);
		}
		
		while (sc.hasNextLine()) {
			System.out.println("hasNextLine()");
			String i = sc.nextLine();
			System.out.println(i);
		}
		
		while (sc.hasNext()) {
			System.out.println("sc.hasNext()");
			String i = sc.next();
			System.out.println(i);
		}
		
		System.out.println("end");
	}

}
