package test;
import java.util.Arrays;
import java.util.Scanner;
// 좌표 정렬하기
class Point implements Comparable<Point> {
	int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point that) {
		if (this.x < that.x) {
			return -1;
		} else if (this.x == that.x) {
			if (this.y < that.y) {
				return -1;
			} else if (this.y == that.y) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return 1;
		}
	}
}
public class s11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Point[] a = new Point[n];
		for (int i = 0; i < n; i++) {
			String[] temp = sc.nextLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			a[i] = new Point(x, y);
		}
		Arrays.sort(a);
		StringBuilder sb = new StringBuilder();
		for (Point p : a) {
			sb.append(p.x + " " + p.y + "\n");
		}
		System.out.print(sb);
	}
}
