package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 수 정렬하기 - ArrayList
public class c2750 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i <n; i++){
			arrayList.add(sc.nextInt());
		}
		
		Collections.sort(arrayList);
		
		for(int x: arrayList){
			System.out.println(x);
		}
	}
}

