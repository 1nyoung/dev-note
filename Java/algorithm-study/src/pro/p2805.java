package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//  나무 자르기 (이분탐색)
public class p2805 {
	static int N, M, arr[] = new int[1000001];
	
	// 길이계산(height높이에서 나무를 잘랐을때) 함수
	static long cal(int height) {
		long rtn = 0;
		for(int i =1; i<=N; i++) {
			if(height<arr[i]) {
				rtn += arr[i] - height;
			}
		}
		return rtn;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 나무의 수 N 높이 M , 배열
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 이거뭐야
		int mx = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i= 1; i<N+1; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			mx = Math.max(mx, arr[i]);
		}
		
		/* 가장 많은 나무를 가져갈때는 가장 낮게 자르면 되는데
		 * 최솟값과 최댓값일때 생각을 해보면...
		 * 중간치를 주고 이분탐색으로   
		 */
		
		int low = 1;
		int hi = mx;
		int mid, ans = 0;
		long tmp;
		
		while(low<hi) {
			mid = (low + hi) / 2;
			
			tmp = cal(mid);
			
			if(tmp<M) {
				hi = mid;
			}else {
				ans = mid;
				low = mid + 1;
			}
		}
		System.out.println(ans);
	}
}
