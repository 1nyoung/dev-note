package string;

import java.util.Scanner;

// 다이얼
public class p5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.next();
		
		int total = 0; 
		
		for(int i = 0; i< line.length(); i++){
			String str = line.charAt(i) + "";
			
			// string은 .equals
			if(str.equals("A")||str.equals("B")||str.equals("C")){
				total = total + 2;
			}else if(str.equals("D")||str.equals("E")||str.equals("F")){
				total = total + 3;
			}else if(str.equals("G") ||str.equals("H")||str.equals("I")){
				total = total + 4;
			}else if(str.equals("J")||str.equals("K")||str.equals("L")){
				total = total + 5;
			}else if(str.equals("M") ||str.equals("N")||str.equals("O")){
				total = total + 6;
			}else if(str.equals("P") ||str.equals("Q")||str.equals("R")||str.equals("S")){
				total = total + 7;
			}else if(str.equals("T")||str.equals("U")||str.equals("V")){
				total = total + 8;
			}else if(str.equals("W") ||str.equals("X")||str.equals("Y")||str.equals("Z")){
				total = total + 9;
			}
		
		}
		System.out.println(total + line.length());
	}
}
