package lecture;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4}, // 1�г� 1, 2�б� ����
							{3.5, 3.6}, // 2�г� 1, 2�б� ����
							{3.7, 4.0}, // 3�г� 1, 2�б� ����
							{4.1, 4.2} }; // 4�г� 1, 2�б� ����

		double sum = 0;
		int year = score.length; //���� ��
		int term = score[0].length; //���� ��
		
		for(int i=0; i<year; i++) {
			for(int j=0; j<term; j++) {
				sum += score[i][j];
			}
		}		
		System.out.println("4�� ��ü ���� ����� " + sum/(year*term));
	}

}
