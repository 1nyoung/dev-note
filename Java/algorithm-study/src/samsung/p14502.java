package samsung;

import java.util.Arrays;
import java.util.Scanner;

// 연구소
public class p14502 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] d = new int[n+1][m+1];
		
		for(int i =1; i<= n;  i ++){			
			for(int j = 1; j<=m; j++){
				d[i][j] = sc.nextInt();
			}			
		}
		
		for(int i =1; i<= n;  i ++){			
			for(int j = 1; j<=m; j++){
				if(d[i][j] == 2){
					// 위
					if(i != 1 && d[i-1][j] == 0){
						d[i-1][j] = 2;
						System.out.println("위");
					}
					
					// 아래
					if(i != n && d[i+1][j] == 0){
						d[i+1][j] = 2;
						System.out.println("아래");
					}
					
					// 왼쪽
					if(j != 1 && d[i][j-1] == 0){
						d[i][j-1] = 2;
						System.out.println("왼쪽");
					}
					
					// 오른쪽
					if(j != m && d[i][j+1] == 0){
						d[i][j+1] = 2;
						System.out.println("오른쪽");
					}
				}
			}			
		}
		
//		int[] arr = {1, 2, 4, 5};
//		int temp = Arrays.binarySearch(arr, 2);
//		System.out.println(temp);
			
		for(int i =1; i<= n;  i ++){			
			for(int j = 1; j<=m; j++){
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(d[i][j] == 0){
					cnt ++;
					System.out.println("h");
				}
			}
		}
		System.out.println(cnt);
		
	}
}
