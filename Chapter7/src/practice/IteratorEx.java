package practice;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		int sum = 0;
		v.add(5);
		v.add(4);
		v.add(100);
		v.add(-1);
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
			System.out.println(n);
		}
		System.out.println("벡터 정수 합 : " + sum);
	}

}
