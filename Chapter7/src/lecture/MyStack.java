package lecture;

class GStack<T> {
	int tos;
	Object [] stack;
	public GStack() {
		tos = 0;
		stack = new Object[10]; //10인 객체 배열 생성
	}
	//push 값, 제네릭 타입에 따라 다름.
	public void push(T item) {
		if (tos == 10) return;
		stack[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0) return null;
		tos --;
		return (T) stack[tos]; //Object는 인식을 못하기 때문에 T로 타입 캐스팅 해야 함.
	}
}
public class MyStack {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int i=0; i<3; i++) System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int i=0; i<3; i++) System.out.println(intStack.pop());
	}

}
