package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Stack {

	int top;
	int[] stack;
	int size;

	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}

	public void push(int value) {
		top++;
		stack[top] = value;
	}

	public void pop() {
		if (top == -1) {
			System.out.println(-1);
		} else {
			System.out.println(stack[top]);
			top--;
		}
	}

	public void size() {
		System.out.println(top + 1);
	}

	public void empty() {
		if (top == -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public void top() {
		if (top == -1) {
			System.out.println(-1);
		} else {
			System.out.println(stack[top]);
		}
	}

	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}


public class p10828 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack stack = new Stack(20);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String cmd;
		StringTokenizer st;
		
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			cmd = st.nextToken();
			if (cmd.equals("push")) {
				int value = Integer.parseInt(st.nextToken());
				stack.push(value);
			} else if (cmd.equals("pop")) {
				stack.pop();
			} else if (cmd.equals("size")) {
				stack.size();
			} else if (cmd.equals("empty")) {
				stack.empty();
			} else if (cmd.equals("top")) {
				stack.top();
			} else {
				System.out.println("err");
			}
		}
		
	}

}
