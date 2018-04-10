package test;

import java.util.Scanner;

public class kakao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr1 = new int[n+1];
		int[] arr2 = new int[n+1];
		
		String [] arr3 = new String[n+1];
		
		for(int i = 1; i <= n; i++){
			arr1[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++){
			arr2[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++){
			arr3[i]= Integer.toBinaryString(arr1[i] | arr2[i]);
		}
		
		for(int i = 1; i<=n; i++){
			//System.out.println(arr3[i]);
			for(int j = 0; j< arr3[i].length(); j++){
				String str = arr3[i].charAt(j)+" ";
				str = str.trim();
				if(str.equals("1")){
					System.out.print("#");
				}else if(str.equals(" ")||str.equals("0")){
					System.out.print(" ");
				}
			}
			System.out.println(",");
		}
	}
}
