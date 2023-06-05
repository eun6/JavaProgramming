package lecture;

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		th1.start();
		th2.start();
	}

}

//공유 집계판
class SharedBoard {
	private int sum = 10;
	//synchronized 삭제한 것과 안 한 것, 분명한 차이!
	synchronized public void add() {
		int n = sum;
		// 현재 실행 중인 스레드 양보, synchronized 하기 위해 필요한 메서드.
		// rock 시키는 메서드로 인지.
		// 그런데 양보를 할 수도 있고 안 할 수도 있고....
		Thread.yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	/*public int getSum() {
		return sum;
	}*/
}

//학생 스레드
class StudentThread extends Thread {
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			board.add();
		}
	}
}
