package lecture;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		
		Iterator<Integer> it = v.iterator();
		int sum = 0;
		while(it.hasNext()) { //방문할 요소가 남아 있으면 true.
			//모든 정수 출력
			int n = it.next(); //다음 요소 리턴
			System.out.println(n);
			
			//모든 정수 더하기
			sum += n;
		} System.out.println("백터에 있는 정수 합 : " + sum);
	}
}
