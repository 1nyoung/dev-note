package samsung;

import java.util.Scanner;

// 퇴사
// dp
public class p14501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] T = new int[n+1];
		int[] P = new int[n+1];
		
		int[] d = new int[n+2];
		
		for(int i=1; i<=n; i++){
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		
		for(int i = 1; i<=n; i++){
			for(int j = i + T[i]; j<=n+1; j++){
				d[j] =Math.max(d[j], d[i]+P[i]);
				for(int x : d){
					System.out.print(x + " ");
				}
				System.out.println();
			}
			System.out.println("================");
			
		}
		//System.out.println(d[n+1]);
		

	}
}
