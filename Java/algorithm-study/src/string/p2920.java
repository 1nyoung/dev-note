package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 음계
public class p2920 {
	
	static int check (String[] A, String[] B){
		int cnt = 0;
		
		for(int i = 0; i<8; i++){
			if(A[i] == B[i]){
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[8];
		String[] asc = new String[8];
		String[] desc = new String[8];
		
		for(int i =0; i<8; i++){
			arr[i] = asc[i] = desc[i] = sc.next();
		}
		
	
		Arrays.sort(asc);
		// 외우기, 리버스오더는 스트링배열만 가능
		Arrays.sort(desc, Collections.reverseOrder());
		
		if(check(arr,asc)==8){
			System.out.println("ascending");
		}else if(check(arr,desc)==8){
			System.out.println("descending");
		}else{
			System.out.println("mixed");
		}
	}
}
