package hh;

import java.util.Scanner;

class convert2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String money = sc.next();
		convert2 my = new convert2();
		System.out.println(my.Money(money) + "원");
	}

	public String Money(String p_money) {
		StringBuffer result = new StringBuffer();
		String[] kr1 = { "", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] kr2 = { "", "십", "백", "천" };
		String[] kr3 = { "", "만", "억", "조" };
		
		int count = 0; // 0 갯수카운트변수
		int len = p_money.length(); // 숫자 길이
		int target; // 해당숫자
		
		for (int i = 0; i < len; i++) {
			// i번째 숫자 캐싱
			target = Integer.parseInt(p_money.charAt(i) + "");
			result.append(kr1[target]);
			System.out.println(kr1[target]);
			
			if (target > 0) {
				result.append(kr2[(len - 1 - i) % 4]); // 십 백 천
				System.out.println((len - 1 - i) % 4);
				
			} else {
				count++; // 0인경우 카운트 증가
				System.out.println("count++");
				
			}
			
			if ((len - 1 - i) % 4 == 0) { // 자리가 4의배수인경우
				// 0이 아닌게 한번이라도 있는경우 만억조 출력
				if (count != 4) {
					// 만 억 조
					result.append(kr3[(len - 1 - i) / 4]);
					System.out.println((len - 1 - i) / 4);
					
				}
				count = 0; // 초기화
			}
		}
		return result.toString();
	}
}