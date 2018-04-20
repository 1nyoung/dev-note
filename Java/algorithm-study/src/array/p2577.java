package array;

import java.util.Scanner;

// 숫자의 개수
public class p2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] arr = new int[10];
		
		String D = String.valueOf(A*B*C);
		
		for(int i = 0; i<D.length(); i ++){
			arr[D.charAt(i)-'0']++;
		}
		
		for(int x : arr){
			System.out.println(x);
		}
	}
}
