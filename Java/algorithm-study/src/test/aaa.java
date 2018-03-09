package test;

import java.util.ArrayList;
import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.toArray();
		
		int[] b = {4, 5, 6};
		
		//int[] arr = a.toArray();
		for(int x : b){
			System.out.println(x);
		}
	}

}
