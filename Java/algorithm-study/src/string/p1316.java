package string;

import java.util.Scanner;

// 그룹단어체커
public class p1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alpha;
		
		int n = sc.nextInt();

		int cnt = n;
		
		for(int i = 0; i <n; i++){
			String str = sc.next();
			alpha = new int[26];
			
			for(int j = 0; j <str.length(); j++){
				//System.out.println(str.charAt(j)-'a');
				if(j == 0){
					alpha[str.charAt(j)-'a'] = 1;
				}
				else if(alpha[str.charAt(j)-'a'] == 0 || (str.charAt(j)+"").equals(str.charAt(j-1)+"")){
					alpha[str.charAt(j)-'a'] = 1;
				}else{
					cnt--;
					break;
				}
			
			}
			
		}
		System.out.println(cnt);
	}
}
