package dp;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int [] d = new int [100];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		d[1] = 0;

		for(int i = 2; i<=n; i++)
		{
			d[i] = d[i-1] + 1;
			
			if(i%2 ==0){
				d[i] = d[i/2] +1;
			}
			if(i%3 ==0){
				d[i] = d[i/3] +1;
			}
		}


		System.out.println(d[n]);

	}

}
