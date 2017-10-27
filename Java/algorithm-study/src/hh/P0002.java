package hh;

import java.util.HashMap;
import java.util.Scanner;

// 21300 이만천삼백
public class P0002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(4, "만");
		hs.put(3, "천");
		hs.put(2, "백");
		hs.put(1, "십");
		hs.put(0, " ");
		
		String[] line = new String[num.length()];
		
		for(int i = 0; i <num.length(); i++){
			line[i] = Integer.toString(num.charAt(i)- '0');
		}
		
		String[] h = {" ", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구", "십"};
		
		for(int i = 0; i< line.length; i++){
			line[i] = h[Integer.parseInt(line[i])];
		}
		
		int size = num.length() -1 ;
		for(String x : line){
			if(!x.equals(" ")){
				System.out.print((x + 	hs.get(size --)).trim());
			}
		}
	}

}
