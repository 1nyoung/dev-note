package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// 세번째
public class p5619 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<String> ar =new ArrayList<String>();
		
		for(int i =0; i<n; i++){
			ar.add(sc.next());
		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i<ar.size(); i++){
			for(int j = 0; j<ar.size(); j++){
				if(i != j){
					int line = Integer.parseInt(ar.get(i) +ar.get(j));
					hs.add(line);
				}
			}
		}
		Integer[] ans = hs.toArray(new Integer[hs.size()]);
		Arrays.sort(ans);
		System.out.println(ans[2]);
	}
}
