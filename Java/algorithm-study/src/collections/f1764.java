package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 맵 - 듣보잡
public class f1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt1 = sc.nextInt();
		int cnt2 = sc.nextInt();
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		
		for(int i = 0; i<cnt1; i++){
			m.put(sc.next(), 1);
		}
		
		for(int i =0; i<cnt2; i++){
			String name = sc.next();
			if(m.containsKey(name)){
				m.put(name, m.get(name) + 1);
			}else{
				m.put(name, 1);
			}
		}
		ArrayList<String> arr = new ArrayList<String>();
		
		for(Map.Entry<String, Integer>e: m.entrySet()){
			if(e.getValue() == 2){
				arr.add(e.getKey());
			}
		}
		
		Collections.sort(arr);
		System.out.println(arr.size());
		for(String s:arr){
			System.out.println(s);
		}
	}
}
