package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

// 회사에 있는 사람 - HashSet
public class c7785 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		HashSet<String> d = new HashSet<String>();
		
		for(int i = 0; i <n; i++){
			String s = sc.nextLine();	
			String[] line = s.split(" ");
			
			if(line[1].equals("enter")){
				d.add(line[0]);
			}else{
				d.remove(line[0]);
			}
		}
		String[] ans = d.toArray(new String[d.size()]);
		
		Arrays.sort(ans, Collections.reverseOrder());
		
		for(String s : ans){
			System.out.println(s);
		}
	}
}
