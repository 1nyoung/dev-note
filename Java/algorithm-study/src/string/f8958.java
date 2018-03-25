package string;

import java.util.Scanner;

// 배열 - OX
public class f8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		String line = sc.nextLine();
		int sum = 0; 
		int score = 0;
		
		
		// String[] str = sc.nextLine().split("");
		for(int i = 0; i<cnt; i++){
			while(sc.hasNext()){
				if(sc.next() == "O"){
					score++;
					sum += score;
					System.out.println("A"+ sum);
				}else{
					score = 0;
					sum += score;
					System.out.println("A"+ sum);
				}
			}
			System.out.println("C"+ sum);
		}
		
	}

}
