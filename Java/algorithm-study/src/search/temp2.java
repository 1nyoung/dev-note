package search;

public class temp2 {
	static class Point {
		int y;
		int x;
		
		Point(int y, int x){
			this.x = x;
			this.y = y;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}
		
	}

	public static void main(String[] args) {
		Point a = new Point(3, 5);
		System.out.println(a.getX());
	}

}
