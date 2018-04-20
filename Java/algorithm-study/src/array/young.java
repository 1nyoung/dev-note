package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class young {

	public static void main(String[] args) {
		/* [Array] - int string 정렬 */

		// Integer[] arr = { 3, 4, 2, 1, 6};
		String[] arr = { "B", "D", "A", "C" };
		Arrays.sort(arr);

		/* 스트링배열, Integer 배열만 Collections.reverseOrder 가능*/
		// Arrays.sort(arr, Collections.reverseOrder());

		for (String x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("============================");

		/* [ List] */
		/* 컬랙션은 사이즈 배열은 렝스 */

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(3);
		list.add(2);

		Collections.sort(list);
		//Collections.reverse(list);

		for (int x : list) {
			System.out.print(x + " ");
		}

		/* [HashMap] */
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("조", 25);
		map.put("이", 23);

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println();
		}
		/* HashSet */
		HashSet<Integer> set = new HashSet<Integer>();

		// 셋은 순서가 보장되지 않는다, 중복해결은 가능
		Integer[] array = { 3, 4, 2, 1, 6, 3, 5, 7 };

		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}

		for (int x : set) {
			System.out.print(x + " ");
		}

		// 다시 배열로 바꿔보기
		Integer[] arr3 = set.toArray(new Integer[set.size()]);

		/* clear, remove */
		
		/* Stack */
		Stack<Integer> stack = new Stack<Integer>();

		// 출력만
		// stack.peek()
		/// 출력하고 삭제
		// stack.pop())
		
		
		/* Quequ */
		Queue<Integer> queue = new LinkedList<Integer>();
		//queue.offer(e)
	}
}
