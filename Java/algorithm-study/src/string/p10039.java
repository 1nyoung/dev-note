package string;

import java.util.Scanner;

// 평균 점수
public class p10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<5; i++){
			if(arr[i] < 40){
				arr[i] = 40;
			}
		}
		
		int sum = 0;
		for(int i = 0; i<5; i++){
			sum = sum + arr[i];
		}
		
		System.out.println(sum/5);
	}
}
