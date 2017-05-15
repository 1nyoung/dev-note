package dp;

import java.util.Scanner;

// 1로 만들기 (참고)
public class p1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int[] d = new int[n+1];
        d[1] = 0;
        
        for (int i=2; i<=n; i++) {
            d[i] = d[i-1] + 1;
            System.out.println('a');
            if (i%2 == 0 && d[i] > d[i/2] + 1) {
            	System.out.println('b');
                d[i] = d[i/2] + 1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
            	System.out.println('c');
            	System.out.println( "i: " + i );
            	System.out.println( "d[i]: " + d[i] );
                d[i] = d[i/3] + 1;
            }
            System.out.println( d[0] +  "  " + d[1]+  " " + d[2]+  "  " + d[3]);
        }
        
        System.out.println(d[n]);

	}

}
