package array;

import java.util.Scanner;

// 단어의 개수
public class p1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine().trim();
		//line.trim();  // 여기는 왜 안되는가,,,
		
		if(line.isEmpty()){
			System.out.println(0);
		}else{
			String[] s = line.split(" ");	
			System.out.println(s.length);
		}
	}
}
