package test;

import java.util.Scanner;

public class Line1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int k = 1; k<= num; k++){
			String line = sc.next();
		
			int cnt = 0;
			char ABC = 0;
			for(int i = 0; i<=line.length(); i++ ){
				
				if(i == line.length()){
					String DDD = line.charAt(i-1) + " ";
					System.out.print(cnt + DDD);
					System.out.println();
					break;
				}
				if(ABC == 0){
					ABC = line.charAt(0); 
				}
				
				if(ABC == line.charAt(i)){
					cnt ++;
				}else{
					String DDD = line.charAt(i-1) + "";
					System.out.print(cnt + DDD);
					
					ABC = line.charAt(i);
					cnt =1;
				}				
			}
			
		}
	}
}
