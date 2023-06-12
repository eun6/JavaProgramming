package lecture;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer> ();

		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100); //4와 -1 사이에 100 삽입.
		System.out.println("백터 내 요소 객체 수 : " + v.size());
		System.out.println("백터의 현재 용량 : " + v.capacity());
		
		//Vector에 넣은 수 모두 출력
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		//Vector 속 모든 수 더하기
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		
		System.out.println("백터에 있는 정수 합 : " + sum);
		
	}
}
