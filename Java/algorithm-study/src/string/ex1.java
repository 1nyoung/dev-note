package string;

import java.util.Arrays;
import java.util.Scanner;

// 두 배열의 값이 같은지 확인하는 방법
public class ex1 {
	static int check (int[] A, int[] B, int length){
		int cnt = 0;
		for(int i = 0; i< length; i++){
			if(A[i] == B[i]){
				cnt++;
			}
		}
		return cnt;
	}

	static boolean check2 (int[] A, int[] B,  int length){
		for(int i = 0; i< length; i++){
			if(A[i] != B[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] A = { 0,0,0,1,1,1};
		int[] B = { 0,0,0,1,1,1};
		
		// 틀린예제, 두 배열이 같은 객체인지 묻는 것
		if(A == B){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		// 틀린예제, 두 배열이 같은 객체인지 묻는 것
		if(A.equals(B)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		if(Arrays.equals(A, B)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		// 하나씩 비교
		if(check(A, B, 6) == 6){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		// 하나씩 비교
		if(check2(A, B, 6)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}
}
