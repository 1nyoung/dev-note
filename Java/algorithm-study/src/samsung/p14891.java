package samsung;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 톱니바퀴
// 극이 같으면 회전 안함
// 극이 다르면 반대방향
// 톱니바퀴는 8사이즈
// N극은 0 S극은 1
// 시계 1 반시계 -1
public class p14891 {
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
		
		String lineA = sc.next();
		for(int i = 0; i< 8; i ++){
			A[i] = lineA.charAt(i) - '0';
		}
		String lineB = sc.next();
		for(int i = 0; i< 8; i ++){
			B[i] = lineB.charAt(i) - '0';
		}
		String lineC = sc.next();
		for(int i = 0; i< 8; i ++){
			C[i] = lineC.charAt(i) - '0';
		}
		String lineD = sc.next();
		for(int i = 0; i< 8; i ++){
			D[i] = lineD.charAt(i) - '0';
		}

		N = sc.nextInt();

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

//		for (int x : A) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//		
//		for (int x : B) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//
//		for (int x : C) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//
//		
//		for (int x : D) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
		int cnt = 0;
		if(A[0] == 1){
			cnt += 1;
		}
		if(B[0] == 1){
			cnt += 2;
		}
		if(C[0] == 1){
			cnt += 4;
		}
		if(D[0] == 1){
			cnt += 8;
		}
		System.out.println(cnt);
	}

}
