package hh;

import java.util.Scanner;

public class convert3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String money = sc.next();
		
		String[] kr1 = { "", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] kr2 = { "", "십", "백", "천" };
		String[] kr3 = { "", "만", "억", "조" };
		
		StringBuffer result = new StringBuffer();
		
		int count = 0;
		int len = money.length();
		int target;
		
		for (int i = 0; i<len; i++){
			target = Integer.parseInt(money.charAt(i)+"");
			result.append(kr1[target]);
			
			if(target >0){
				result.append(kr2[(len-1-i) % 4]); 
			}else{
				count ++;
			}
			
			if((len-1-i) % 4 == 0){
				if(count !=4){
					result.append(kr3[(len-1-i)/4]);
				}
				count = 0;
			}
		}	
		
		System.out.println(result.toString());
	}
}
