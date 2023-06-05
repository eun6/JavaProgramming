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

//���� ������
class SharedBoard {
	private int sum = 10;
	//synchronized ������ �Ͱ� �� �� ��, �и��� ����!
	synchronized public void add() {
		int n = sum;
		// ���� ���� ���� ������ �纸, synchronized �ϱ� ���� �ʿ��� �޼���.
		// rock ��Ű�� �޼���� ����.
		// �׷��� �纸�� �� ���� �ְ� �� �� ���� �ְ�....
		Thread.yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	/*public int getSum() {
		return sum;
	}*/
}

//�л� ������
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
