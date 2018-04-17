package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ttest {
	static int[] A = new int[8];
	static int[] B = new int[8];
	static int[] C = new int[8];
	static int[] D = new int[8];

	static int N;

	static void roro(int[] arr, int d) {
		int temp[] = new int[8];

		// 시계
		if (d == 1) {
			for (int i = 0; i < 7; i++) {
				temp[i + 1] = arr[i];
			}
			temp[0] = arr[7];

			for (int i = 0; i < 8; i++) {
				arr[i] = temp[i];
			}
		}

		// 반시계
		if (d == -1) {
			for (int i = 1; i < 8; i++) {
				temp[i - 1] = arr[i];
			}
			temp[7] = arr[0];

			for (int i = 0; i < 8; i++) {
				arr[i] = temp[i];
			}

		}
	}

	static void rotateA(int d) {
		HashMap<int[], Integer> map = new HashMap<int[], Integer>();
		map.put(A, d);

		if (A[2] != B[6]) {
			map.put(B, -d);

			if (B[2] != C[6]) {
				map.put(C, d);

				if (C[2] != D[6]) {
					map.put(D, -d);
				}
			}
		}

		for (Map.Entry<int[], Integer> e : map.entrySet()) {
			roro(e.getKey(), e.getValue());
		}
	}

	static void rotateB(int d) {
		HashMap<int[], Integer> map = new HashMap<int[], Integer>();
		map.put(B, d);

		if (B[6] != A[2]) {
			map.put(A, -d);
		}

		if (B[2] != C[6]) {
			map.put(C, -d);

			if (C[2] != D[6]) {
				map.put(D, d);
			}
		}

		for (Map.Entry<int[], Integer> e : map.entrySet()) {
			roro(e.getKey(), e.getValue());
		}
	}

	static void rotateC(int d) {
		HashMap<int[], Integer> map = new HashMap<int[], Integer>();
		map.put(C, d);

		if (C[6] != B[2]) {
			map.put(B, -d);

			if (B[6] != A[2]) {
				map.put(A, d);
			}
		}

		if (C[2] != D[6]) {
			map.put(D, -d);
		}

		for (Map.Entry<int[], Integer> e : map.entrySet()) {
			roro(e.getKey(), e.getValue());
		}
	}

	static void rotateD(int d) {
		HashMap<int[], Integer> map = new HashMap<int[], Integer>();
		map.put(D, d);

		if (D[6] != C[2]) {
			map.put(C, -d);

			if (C[6] != B[2]) {
				map.put(B, d);

				if (B[6] != A[2]) {
					map.put(A, -d);
				}
			}
		}

		for (Map.Entry<int[], Integer> e : map.entrySet()) {
			roro(e.getKey(), e.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();

			for (int i = 0; i < 8; i++) {
				A[i] = sc.nextInt();
			}
			
			for (int i = 0; i < 8; i++) {
				B[i] = sc.nextInt();
			}

			for (int i = 0; i < 8; i++) {
				C[i] = sc.nextInt();
			}

			for (int i = 0; i < 8; i++) {
				D[i] = sc.nextInt();
			}

			for (int i = 0; i < N; i++) {
				int t = sc.nextInt();
				int dd = sc.nextInt();

				switch (t) {
				case 1:
					rotateA(dd);
					break;
				case 2:
					rotateB(dd);
					break;
				case 3:
					rotateC(dd);
					break;
				case 4:
					rotateD(dd);
					break;
				}
			}

			int cnt = 0;
			if (A[0] == 1) {
				cnt += 1;
			}
			if (B[0] == 1) {
				cnt += 2;
			}
			if (C[0] == 1) {
				cnt += 4;
			}
			if (D[0] == 1) {
				cnt += 8;
			}
			System.out.println("#" +test_case + " "+ cnt);
		}
	}
}
