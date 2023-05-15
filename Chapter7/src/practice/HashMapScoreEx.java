package practice;

import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("HashMap의 요소 개수 :");
		int num = sc.nextInt();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<num; i++) {
			String name = sc.next();
			int score = sc.nextInt();
			map.put(name, score);
		}
		//System.out.println(map.entrySet());
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score =  map.get(name);
			System.out.println(name + " : " + score);
		}
	}

}
