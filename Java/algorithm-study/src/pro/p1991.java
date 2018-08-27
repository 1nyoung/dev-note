package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 트리순회
public class p1991 {
	
	static class NODE{
		String val;
		int parent, right, left;
		public NODE(String val) {
			this.val = val;
			this.parent = this.right = this.left = -1;
		}
	};
	
	// N,  NODE배열, 문자열
	static int N;
	static NODE A[] =new NODE[26];
	static String tmpstr;
	
	
	//전위 순회
	static void preOrder(int node) {
		
	}
	
	// 중위 순회
	static void inOrder(int node) {
		
	}
	
	// 후위 순회
	static void postOrder(int node) { 
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i<26; i++) {
			A[i] = new NODE(Character.toString((char)(i+'A')));
			
		}
		
		
	}

}
