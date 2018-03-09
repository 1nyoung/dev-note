package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class assss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i = 0; i<n; i++){
			set.add(sc.next());
		}
		
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 0; i<m; i++){
			String name = sc.next();
			if(set.contains(name)){
				arr.add(name);
			}
		}
		
		Collections.sort(arr);
		System.out.println(arr.size());
		for(String s : arr){
			System.out.println(s);
		}
	}
}
