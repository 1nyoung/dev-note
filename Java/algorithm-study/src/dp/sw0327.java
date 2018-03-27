package dp;

import java.util.Scanner;

// sw expert Academy 수영장
public class sw0327 {
	
	static int max = 1<<30;
	
	static int[] costtable = new int[4];
	
	static int[] Plan = new int[13];
	
	static void Search(int month, int cost){
		if(month >=12){
			if(cost<max){
				max = cost;
				return;
			}
		}
		Search(month +1, cost + costtable[0]*Plan[month]);
		Search(month +1, cost + costtable[1]);
		Search(month +1, cost + costtable[2]);
		Search(month +1, cost + costtable[3]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test_case =1; test_case <=t; test_case++){
			max = 1<<30;
			for(int i = 0; i<4; i++){
				costtable[i] = sc.nextInt();
			}
			for(int i = 0; i<12; i++){
				Plan[i] = sc.nextInt();
			}
			Search(0, 0);
			System.out.println("#" + test_case + " " + max);
		
		}
	}
}
