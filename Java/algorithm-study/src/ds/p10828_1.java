package ds;

import java.util.Scanner;

public class p10828_1 {
	static class Stack_1 {
		int top;
		int[] stack;
		int size;

		public Stack_1(int size) {
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

	public static void main(String[] args) {
		Stack_1 stack = new Stack_1(20);
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String cmd;

		for (int i = 0; i < cnt; i++) {
			cmd = sc.next();
			if (cmd.equals("push")) {
				int value = sc.nextInt();
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
