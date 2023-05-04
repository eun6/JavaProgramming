package lecture;

import java.util.*;

public class HashMapDicEx {
	/*public static <K, V> K getKey(HashMap<K, V> dic, V value) {	 
        for (K key : dic.keySet()) {
            if (value.equals(dic.get(key))) {
                return key;
            }
        }
        return null;
    }*/

	public static void main(String[] args) {
		//HashMap 컬렉션 생성
		HashMap <String, String> dic = new HashMap<String, String> ();
		
		dic.put("apple", "사과");
		dic.put("love", "사랑");
		dic.put("baby", "아기");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String search = sc.next();
			
			String kor = dic.get(search);
			if(search.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			} else if(dic.containsKey(search)) {
				System.out.println(kor);
			} else if (dic.containsValue(search)) {
				//System.out.println(getKey(dic, search));
			} else {
				System.out.println(search + "는 없는 단어 입니다.");
			}
		}
		sc.close();
	}

}
