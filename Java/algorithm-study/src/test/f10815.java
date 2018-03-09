package test;

import java.util.HashSet;
import java.util.Scanner;

// 셋 - 숫자카드
public class f10815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> d = new HashSet<Integer>();
		
		int cnt = sc.nextInt();
		for(int i = 0; i<cnt; i++){
			d.add(sc.nextInt());
		}
		
		int cnt2 = sc.nextInt();
		
		for(int i = 0; i<cnt2; i++){
			if(d.contains(sc.nextInt())){
				System.out.print(1+" ");
			}else{
				System.out.print(0+" ");
			}
		}
	}
}
